package com.kodwala.payment.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kodwala.payment.entity.PaymentEntity;
import com.kodwala.payment.kafka.OrderCreatedEvent;
import com.kodwala.payment.kafka.PaymentKafkaProducer;
import com.kodwala.payment.kafka.PaymentSuccessEvent;
import com.kodwala.payment.repository.PaymentRepository;

@Service
public class PaymentService {

	private final PaymentRepository paymentRepository;
	private final PaymentKafkaProducer paymentKafkaProducer;
	
	public PaymentService (PaymentRepository paymentRepository, PaymentKafkaProducer paymentKafkaProducer) {
		this.paymentRepository = paymentRepository;
		this.paymentKafkaProducer = paymentKafkaProducer;
	}
	
	public PaymentEntity processPayment (OrderCreatedEvent event) {
		PaymentEntity payment = new PaymentEntity();
		
		payment.setOrderId(event.getOrderId());
		payment.setCustomerId(event.getCustomerId());
		payment.setAmount(event.getAmount());
		payment.setPaymentId("TXN"+UUID.randomUUID().toString().substring(0,8).toUpperCase());
		
		payment.setPaymentMethod("UPI");
		
		payment.setPaymentStatus("SUCCESS");
		
		payment.setReason(null);
		
		PaymentEntity savedPayment = paymentRepository.save(payment);
		
		System.out.println("Payment saved successfully");
		System.out.println("Payment ID  :"+savedPayment.getPaymentId());
		System.out.println("OrderID  : "+savedPayment.getOrderId());
		System.out.println("Payment Status : "+savedPayment.getPaymentStatus());
		
		PaymentSuccessEvent successEvent = new PaymentSuccessEvent();
		
		successEvent.setEventId(UUID.randomUUID().toString());
		successEvent.setEventType("PAYMENT_SUCCESS");
		successEvent.setOrderId(savedPayment.getOrderId());
		successEvent.setCustomerId(savedPayment.getCustomerId());
		successEvent.setAmount(savedPayment.getAmount());
		successEvent.setPaymentId(savedPayment.getPaymentId());
		successEvent.setPaymentMethod(savedPayment.getPaymentMethod());
		successEvent.setPaymentStatus(savedPayment.getPaymentStatus());
		
		paymentKafkaProducer.publishPaymentSuccess(successEvent);
		
		return savedPayment;
	}
}
