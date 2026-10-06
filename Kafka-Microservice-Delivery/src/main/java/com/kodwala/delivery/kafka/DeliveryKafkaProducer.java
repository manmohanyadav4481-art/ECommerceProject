
package com.kodwala.delivery.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class DeliveryKafkaProducer {

    private static final String TOPIC = "delivery-created";

    private final KafkaTemplate<String, DeliveryCreatedEvent> kafkaTemplate;

    public DeliveryKafkaProducer(
            KafkaTemplate<String, DeliveryCreatedEvent> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishDeliveryCreated(
            DeliveryCreatedEvent event) {

        kafkaTemplate.send(
                TOPIC,
                String.valueOf(event.getOrderId()),
                event
        ).whenComplete((result, exception) -> {

            if (exception == null) {

                System.out.println(
                        "======================================"
                );

                System.out.println(
                        "DELIVERY_CREATED SENT SUCCESSFULLY"
                );

                System.out.println(
                        "Topic     : "
                        + result.getRecordMetadata().topic()
                );

                System.out.println(
                        "Partition : "
                        + result.getRecordMetadata().partition()
                );

                System.out.println(
                        "Offset    : "
                        + result.getRecordMetadata().offset()
                );

                System.out.println(
                        "Order ID  : "
                        + event.getOrderId()
                );

                System.out.println(
                        "Tracking ID : "
                        + event.getTrackingId()
                );

                System.out.println(
                        "======================================"
                );

            } else {

                System.out.println(
                        "======================================"
                );

                System.out.println(
                        "DELIVERY_CREATED SEND FAILED"
                );

                System.out.println(
                        "Order ID : "
                        + event.getOrderId()
                );

                System.out.println(
                        "======================================"
                );

                exception.printStackTrace();
            }
        });
    }
}
