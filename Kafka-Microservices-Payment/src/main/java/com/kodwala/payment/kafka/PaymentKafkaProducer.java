package com.kodwala.payment.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentKafkaProducer {

	private static final String TOPIC = "payamet-success";
	
	private final KafkaTemplate<String, PaymentSuccessEvent> kafkaTemplate;
	
	public PaymentKafkaProducer (KafkaTemplate<String, PaymentSuccessEvent> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void publishPaymentSuccess(PaymentSuccessEvent successEvent) {
		
		kafkaTemplate.send(TOPIC, String.valueOf(successEvent.getOrderId()), successEvent);
		
		System.out.println("PAYMENT_SUCCESS event published for orderId : " +successEvent.getOrderId());
	}
}
