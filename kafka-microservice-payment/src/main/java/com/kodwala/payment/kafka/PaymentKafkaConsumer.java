package com.kodwala.payment.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kodwala.payment.service.PaymentService;

@Component
public class PaymentKafkaConsumer {

    private final PaymentService paymentService;

    public PaymentKafkaConsumer(
            PaymentService paymentService) {

        this.paymentService = paymentService;
    }

    @KafkaListener(
            topics = "order-created",
            groupId = "payment-service-group"
    )
    public void consumeOrderCreated(
            OrderCreatedEvent event) {

        paymentService.processPayment(event);
    }
}