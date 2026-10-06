package com.kodwala.payment.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kodwala.payment.entity.PaymentEntity;
import com.kodwala.payment.service.PaymentService;

@Component
public class PaymentKafkaConsumer {

	private final PaymentService paymentService;
	
	public PaymentKafkaConsumer (PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@KafkaListener(topics ="order-created", groupId = "payment-service-group")
	
	public void consumerOrderCreated(OrderCreatedEvent event) {
		
		System.out.println("==================================================================");
		
		System.out.println("ORDER_CREATED received");
		System.out.println("Event ID : "+event.getEventId());
		System.out.println("Event Type : "+event.getEventType());
		System.out.println("Order ID : "+event.getOrderId());
		System.out.println("Customer ID : "+event.getCustomerId());
		System.out.println("Amount  : "+event.getAmount());
		System.out.println("Address  : "+event.getDeliveryAddress());
		System.out.println("====================================================================");
		
		 PaymentEntity payment = paymentService.processPayment(event);
		
		System.out.println("Payment Processed : "+ payment.getPaymentStatus());
	}
}
