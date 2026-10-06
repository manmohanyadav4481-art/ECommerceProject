package com.kodwala.notification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kodwala.notification.service.NotificationService;

@Component
public class NotificationKafkaConsumer {

    private final NotificationService notificationService;

    public NotificationKafkaConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @KafkaListener(
            topics = "delivery-created",
            groupId = "notification-service-group"
    )
    public void consumeDeliveryCreated(DeliveryCreatedEvent event) {

        System.out.println("==============================================");
        System.out.println("DELIVERY_CREATED RECEIVED");
        System.out.println("==============================================");

        System.out.println("Event ID         : " + event.getEventId());
        System.out.println("Event Type       : " + event.getEventType());
        System.out.println("Order ID         : " + event.getOrderId());
        System.out.println("Customer ID      : " + event.getCustomerId());
        System.out.println("Delivery Address : " + event.getDeliveryAddress());
        System.out.println("Tracking ID      : " + event.getTrackingId());
        System.out.println("Delivery Status  : " + event.getDeliveryStatus());

        System.out.println("==============================================");

        // Send notification
        notificationService.sendNotification(event);
    }
}