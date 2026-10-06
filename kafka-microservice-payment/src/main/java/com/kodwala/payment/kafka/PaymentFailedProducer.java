package com.kodwala.payment.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentFailedProducer {

    private static final String TOPIC = "payment-failed";

    private final KafkaTemplate<String, PaymentFailedEvent> kafkaTemplate;

    public PaymentFailedProducer(
            KafkaTemplate<String, PaymentFailedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishPaymentFailed(PaymentFailedEvent failedEvent) {

        kafkaTemplate.send(
                TOPIC,
                String.valueOf(failedEvent.getOrderId()),
                failedEvent
        ).whenComplete((result, exception) -> {

            if (exception == null) {

                System.out.println(
                        "PAYMENT_FAILED SENT SUCCESSFULLY"
                );

                System.out.println(
                        "Topic : "
                        + result.getRecordMetadata().topic()
                );

                System.out.println(
                        "Partition : "
                        + result.getRecordMetadata().partition()
                );

                System.out.println(
                        "Offset : "
                        + result.getRecordMetadata().offset()
                );

            } else {

                System.out.println(
                        "PAYMENT_FAILED SEND FAILED"
                );

                exception.printStackTrace();
            }
        });
    }
}