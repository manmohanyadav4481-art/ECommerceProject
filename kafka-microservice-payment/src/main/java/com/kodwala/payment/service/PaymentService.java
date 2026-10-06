package com.kodwala.payment.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kodwala.payment.entity.PaymentEntity;
import com.kodwala.payment.kafka.OrderCreatedEvent;
import com.kodwala.payment.kafka.PaymentFailedEvent;
import com.kodwala.payment.kafka.PaymentFailedProducer;
import com.kodwala.payment.kafka.PaymentKafkaProducer;
import com.kodwala.payment.kafka.PaymentSuccessEvent;
import com.kodwala.payment.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    private final PaymentKafkaProducer paymentKafkaProducer;

    private final PaymentFailedProducer paymentFailedProducer;

    public PaymentService(
            PaymentRepository paymentRepository,
            PaymentKafkaProducer paymentKafkaProducer,
            PaymentFailedProducer paymentFailedProducer) {

        this.paymentRepository = paymentRepository;
        this.paymentKafkaProducer = paymentKafkaProducer;
        this.paymentFailedProducer = paymentFailedProducer;
    }

    public PaymentEntity processPayment(OrderCreatedEvent event) {

        // =====================================================
        // CREATE PAYMENT
        // =====================================================

        PaymentEntity payment = new PaymentEntity();

        payment.setOrderId(event.getOrderId());
        payment.setCustomerId(event.getCustomerId());
        payment.setAmount(event.getAmount());

        payment.setPaymentId(
                "TXN"
                        + UUID.randomUUID()
                                .toString()
                                .substring(0, 8)
                                .toUpperCase()
        );

        payment.setPaymentMethod("UPI");

        // =====================================================
        // PAYMENT FAILED
        // =====================================================

        if (event.getAmount() > 50000) {

            payment.setPaymentStatus("FAILED");

            payment.setReason(
                    "Payment amount exceeds allowed limit"
            );

            PaymentEntity savedPayment =
                    paymentRepository.save(payment);

            // =================================================
            // PAYMENT FAILED CONSOLE
            // =================================================

            System.out.println();
            System.out.println("================================================");
            System.out.println("             PAYMENT FAILED");
            System.out.println("================================================");
            System.out.println(
                    "Order ID          : "
                            + savedPayment.getOrderId()
            );
            System.out.println(
                    "Customer ID       : "
                            + savedPayment.getCustomerId()
            );
            System.out.println(
                    "Payment ID        : "
                            + savedPayment.getPaymentId()
            );
            System.out.println(
                    "Amount            : "
                            + savedPayment.getAmount()
            );
            System.out.println(
                    "Payment Method    : "
                            + savedPayment.getPaymentMethod()
            );
            System.out.println(
                    "Payment Status    : "
                            + savedPayment.getPaymentStatus()
            );
            System.out.println(
                    "Reason            : "
                            + savedPayment.getReason()
            );
            System.out.println(
                    "Event             : PAYMENT_FAILED"
            );
            System.out.println("================================================");
            System.out.println();

            // =================================================
            // CREATE PAYMENT_FAILED EVENT
            // =================================================

            PaymentFailedEvent failedEvent =
                    new PaymentFailedEvent();

            failedEvent.setEventId(
                    UUID.randomUUID().toString()
            );

            failedEvent.setEventType(
                    "PAYMENT_FAILED"
            );

            failedEvent.setOrderId(
                    savedPayment.getOrderId()
            );

            failedEvent.setCustomerId(
                    savedPayment.getCustomerId()
            );

            failedEvent.setAmount(
                    savedPayment.getAmount()
            );

            failedEvent.setPaymentId(
                    savedPayment.getPaymentId()
            );

            failedEvent.setPaymentMethod(
                    savedPayment.getPaymentMethod()
            );

            failedEvent.setPaymentStatus(
                    savedPayment.getPaymentStatus()
            );

            failedEvent.setReason(
                    savedPayment.getReason()
            );

            // =================================================
            // PUBLISH PAYMENT_FAILED
            // =================================================

            paymentFailedProducer.publishPaymentFailed(
                    failedEvent
            );

            return savedPayment;
        }

        // =====================================================
        // PAYMENT SUCCESS
        // =====================================================

        payment.setPaymentStatus("SUCCESS");
        payment.setReason(null);

        PaymentEntity savedPayment =
                paymentRepository.save(payment);

        // =====================================================
        // CREATE PAYMENT_SUCCESS EVENT
        // =====================================================

        PaymentSuccessEvent successEvent =
                new PaymentSuccessEvent();

        successEvent.setEventId(
                UUID.randomUUID().toString()
        );

        successEvent.setEventType(
                "PAYMENT_SUCCESS"
        );

        successEvent.setOrderId(
                savedPayment.getOrderId()
        );

        successEvent.setCustomerId(
                savedPayment.getCustomerId()
        );

        successEvent.setAmount(
                savedPayment.getAmount()
        );

        successEvent.setPaymentId(
                savedPayment.getPaymentId()
        );

        successEvent.setPaymentMethod(
                savedPayment.getPaymentMethod()
        );

        successEvent.setPaymentStatus(
                savedPayment.getPaymentStatus()
        );

        successEvent.setDeliveryAddress(
                event.getDeliveryAddress()
        );

        // =====================================================
        // PAYMENT SUCCESS CONSOLE
        // =====================================================

        System.out.println();
        System.out.println("================================================");
        System.out.println("             PAYMENT SUCCESS");
        System.out.println("================================================");
        System.out.println(
                "Order ID          : "
                        + savedPayment.getOrderId()
        );
        System.out.println(
                "Customer ID       : "
                        + savedPayment.getCustomerId()
        );
        System.out.println(
                "Payment ID        : "
                        + savedPayment.getPaymentId()
        );
        System.out.println(
                "Amount            : "
                        + savedPayment.getAmount()
        );
        System.out.println(
                "Payment Method    : "
                        + savedPayment.getPaymentMethod()
        );
        System.out.println(
                "Payment Status    : "
                        + savedPayment.getPaymentStatus()
        );
        System.out.println(
                "Event             : PAYMENT_SUCCESS"
        );
        System.out.println("================================================");
        System.out.println();

        // =====================================================
        // PUBLISH PAYMENT_SUCCESS
        // =====================================================

        paymentKafkaProducer.publishPaymentSuccess(
                successEvent
        );

        return savedPayment;
    }
}