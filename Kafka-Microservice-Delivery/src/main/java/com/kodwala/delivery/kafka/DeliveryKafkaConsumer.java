package com.kodwala.delivery.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kodwala.delivery.service.DeliveryService;

@Component
public class DeliveryKafkaConsumer {

    private final DeliveryService deliveryService;

    public DeliveryKafkaConsumer(
            DeliveryService deliveryService) {

        this.deliveryService = deliveryService;
    }

    @KafkaListener(
            topics = "payment-success",
            groupId = "delivery-service-group"
    )
    public void consumePaymentSuccess(
            PaymentSuccessEvent event) {

        deliveryService.createDelivery(event);
    }
}