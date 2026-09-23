package com.zepto.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {

        System.out.println(
                "KafkaService.sendMessage() ::::: SENDING MESSAGE TO KAFKA"
        );

        kafkaTemplate.send(topic, message)
                .whenComplete((result, exception) -> {

                    if (exception == null) {
                        System.out.println(
                                "Kafka message sent successfully"
                        );

                        System.out.println(
                                "Topic: " + result.getRecordMetadata().topic()
                        );

                        System.out.println(
                                "Partition: " +
                                result.getRecordMetadata().partition()
                        );

                        System.out.println(
                                "Offset: " +
                                result.getRecordMetadata().offset()
                        );

                    } else {
                        System.out.println(
                                "Kafka message failed: "
                                + exception.getMessage()
                        );
                    }
                });
    }
}