package com.kodwala.delivery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kodwala.delivery.entity.DeliveryEntity;
import com.kodwala.delivery.kafka.DeliveryCreatedEvent;
import com.kodwala.delivery.kafka.DeliveryKafkaProducer;
import com.kodwala.delivery.kafka.PaymentSuccessEvent;
import com.kodwala.delivery.repository.DeliveryRepository;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;
    private final DeliveryKafkaProducer deliveryKafkaProducer;

    public DeliveryService(
            DeliveryRepository deliveryRepository,
            DeliveryKafkaProducer deliveryKafkaProducer) {

        this.deliveryRepository = deliveryRepository;
        this.deliveryKafkaProducer = deliveryKafkaProducer;
    }

    public DeliveryEntity createDelivery(
            PaymentSuccessEvent event) {

        // =====================================================
        // CREATE DELIVERY
        // =====================================================

        DeliveryEntity delivery = new DeliveryEntity();

        delivery.setOrderId(
                event.getOrderId()
        );

        delivery.setCustomerId(
                event.getCustomerId()
        );

        delivery.setDeliveryAddress(
                event.getDeliveryAddress()
        );

        delivery.setTrackingId(
                "TRK"
                + UUID.randomUUID()
                        .toString()
                        .substring(0, 8)
                        .toUpperCase()
        );

        delivery.setDeliveryStatus("CREATED");

        // =====================================================
        // SAVE DELIVERY IN MYSQL
        // =====================================================

        DeliveryEntity savedDelivery =
                deliveryRepository.save(delivery);

        // =====================================================
        // CREATE DELIVERY_CREATED EVENT
        // =====================================================

        DeliveryCreatedEvent deliveryEvent =
                new DeliveryCreatedEvent();

        deliveryEvent.setEventId(
                UUID.randomUUID().toString()
        );

        deliveryEvent.setEventType(
                "DELIVERY_CREATED"
        );

        deliveryEvent.setOrderId(
                savedDelivery.getOrderId()
        );

        deliveryEvent.setCustomerId(
                savedDelivery.getCustomerId()
        );

        deliveryEvent.setDeliveryAddress(
                savedDelivery.getDeliveryAddress()
        );

        deliveryEvent.setTrackingId(
                savedDelivery.getTrackingId()
        );

        deliveryEvent.setDeliveryStatus(
                savedDelivery.getDeliveryStatus()
        );

        // =====================================================
        // CLEAN DELIVERY CONSOLE OUTPUT
        // =====================================================

        System.out.println();

        System.out.println(
                "================================================"
        );

        System.out.println(
                "       DELIVERY CREATED SUCCESSFULLY"
        );

        System.out.println(
                "================================================"
        );

        System.out.println(
                "Order ID          : "
                + savedDelivery.getOrderId()
        );

        System.out.println(
                "Customer ID       : "
                + savedDelivery.getCustomerId()
        );

        System.out.println(
                "Tracking ID       : "
                + savedDelivery.getTrackingId()
        );

        System.out.println(
                "Delivery Address  : "
                + savedDelivery.getDeliveryAddress()
        );

        System.out.println(
                "Delivery Status   : "
                + savedDelivery.getDeliveryStatus()
        );

        System.out.println(
                "Event             : DELIVERY_CREATED"
        );

        System.out.println(
                "================================================"
        );

        System.out.println();

        // =====================================================
        // PUBLISH DELIVERY_CREATED
        // =====================================================

        deliveryKafkaProducer.publishDeliveryCreated(
                deliveryEvent
        );

        return savedDelivery;
    }
}