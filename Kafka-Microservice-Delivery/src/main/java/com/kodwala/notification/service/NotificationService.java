package com.kodwala.notification.service;

import org.springframework.stereotype.Service;

import com.kodwala.notification.entity.NotificationEntity;
import com.kodwala.notification.kafka.DeliveryCreatedEvent;
import com.kodwala.notification.repository.NotificationRepository;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public NotificationEntity sendNotification(DeliveryCreatedEvent event) {

        NotificationEntity notification = new NotificationEntity();

        notification.setOrderId(event.getOrderId());
        notification.setCustomerId(event.getCustomerId());

        notification.setNotificationType("DELIVERY_CREATED");

        String message =
                "Your order " + event.getOrderId()
                + " has been created for delivery. "
                + "Tracking ID: " + event.getTrackingId()
                + ". Delivery Address: " + event.getDeliveryAddress();

        notification.setMessage(message);

        notification.setNotificationStatus("SENT");

        NotificationEntity savedNotification =
                notificationRepository.save(notification);

        System.out.println("==============================================");
        System.out.println("NOTIFICATION SENT");
        System.out.println("==============================================");

        System.out.println("Order ID          : "
                + savedNotification.getOrderId());

        System.out.println("Customer ID       : "
                + savedNotification.getCustomerId());

        System.out.println("Notification Type : "
                + savedNotification.getNotificationType());

        System.out.println("Message           : "
                + savedNotification.getMessage());

        System.out.println("Status            : "
                + savedNotification.getNotificationStatus());

        System.out.println("==============================================");

        return savedNotification;
    }
}