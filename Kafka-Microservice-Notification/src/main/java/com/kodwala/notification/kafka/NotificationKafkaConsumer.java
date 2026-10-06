package com.kodwala.notification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodwala.notification.service.NotificationService;

@Component
public class NotificationKafkaConsumer {

    private final NotificationService notificationService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public NotificationKafkaConsumer(
            NotificationService notificationService) {

        this.notificationService = notificationService;
    }


    // =========================================================
    // 1. ORDER CREATED
    // =========================================================

    @KafkaListener(
            topics = "order-created",
            groupId = "notification-order-monitor-group"
    )
    public void consumeOrderCreated(String message) {

        try {

            OrderCreatedEvent event =
                    objectMapper.readValue(
                            message,
                            OrderCreatedEvent.class
                    );

            System.out.println();
            System.out.println("================================================");
            System.out.println("          ORDER CREATED SUCCESSFULLY");
            System.out.println("================================================");

            System.out.println("Order ID          : "
                    + event.getOrderId());

            System.out.println("Customer ID       : "
                    + event.getCustomerId());

            System.out.println("Amount            : "
                    + event.getAmount());

            System.out.println("Delivery Address  : "
                    + event.getDeliveryAddress());

            System.out.println("Order Status      : CREATED");

            System.out.println("Event             : ORDER_CREATED");

            System.out.println("================================================");
            System.out.println();

        } catch (Exception e) {

            System.out.println(
                    "ORDER_CREATED conversion error: "
                    + e.getMessage()
            );
        }
    }


    // =========================================================
    // 2. PAYMENT SUCCESS
    // =========================================================

    @KafkaListener(
            topics = "payment-success",
            groupId = "notification-payment-monitor-group"
    )
    public void consumePaymentSuccess(String message) {

        try {

            PaymentSuccessEvent event =
                    objectMapper.readValue(
                            message,
                            PaymentSuccessEvent.class
                    );

            System.out.println();
            System.out.println("================================================");
            System.out.println("             PAYMENT SUCCESS");
            System.out.println("================================================");

            System.out.println("Order ID          : "
                    + event.getOrderId());

            System.out.println("Customer ID       : "
                    + event.getCustomerId());

            System.out.println("Payment ID        : "
                    + event.getPaymentId());

            System.out.println("Amount            : "
                    + event.getAmount());

            System.out.println("Payment Method    : "
                    + event.getPaymentMethod());

            System.out.println("Payment Status    : "
                    + event.getPaymentStatus());

            System.out.println("Event             : PAYMENT_SUCCESS");

            System.out.println("================================================");
            System.out.println();

        } catch (Exception e) {

            System.out.println(
                    "PAYMENT_SUCCESS conversion error: "
                    + e.getMessage()
            );
        }
    }


    // =========================================================
    // 3. DELIVERY CREATED
    // =========================================================

    @KafkaListener(
            topics = "delivery-created",
            groupId = "notification-service-group"
    )
    public void consumeDeliveryCreated(String message) {

        try {

            DeliveryCreatedEvent event =
                    objectMapper.readValue(
                            message,
                            DeliveryCreatedEvent.class
                    );

            System.out.println();
            System.out.println("================================================");
            System.out.println("       DELIVERY CREATED SUCCESSFULLY");
            System.out.println("================================================");

            System.out.println("Order ID          : "
                    + event.getOrderId());

            System.out.println("Customer ID       : "
                    + event.getCustomerId());

            System.out.println("Tracking ID       : "
                    + event.getTrackingId());

            System.out.println("Delivery Address  : "
                    + event.getDeliveryAddress());

            System.out.println("Delivery Status   : "
                    + event.getDeliveryStatus());

            System.out.println("Event             : DELIVERY_CREATED");

            System.out.println("================================================");
            System.out.println();


            // Save notification
            notificationService.sendNotification(event);

        } catch (Exception e) {

            System.out.println(
                    "DELIVERY_CREATED conversion error: "
                    + e.getMessage()
            );
        }
    }
}