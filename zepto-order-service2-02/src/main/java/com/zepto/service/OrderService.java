
package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.entity.PaymentEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.payment.repository.PaymentRepository;
import com.zepto.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Transactional
    public OrderResponse acceptOrder(OrderRequest orderRequest) {

        System.out.println("OrderService.acceptOrder()::::::::::: START");

        // Create Order Entity
        OrderEntity entity = new OrderEntity();

        entity.setCustomerId(orderRequest.getCustomerId());
        entity.setPaymentMethod(orderRequest.getPaymentMethod());
        entity.setProductId(orderRequest.getProductId());
        entity.setQuantity(orderRequest.getQuantity());
        entity.setShippingAddress(orderRequest.getShippingAddress());

        // Generate Order ID
        entity.setOrderId(generateOrderID());

        // Creating the order
        OrderEntity responseEntity = orderRepository.save(entity);

        // Confirm the Payment
        PaymentEntity paymentEntity = new PaymentEntity();

        // Generate Amount
        int amount = generateAmount();

        paymentEntity.setAmount(amount);

        // Generate Payment Reference
        paymentEntity.setPaymentRef(generatePaymentRef());

        // Payment Status
        paymentEntity.setStatus("PAID");

        // Save Payment
        PaymentEntity responsePaymentEntity =
                paymentRepository.save(paymentEntity);

        // Create Order Response
        OrderResponse orderResponse = new OrderResponse();

        // Check whether payment was successfully saved
        if (responsePaymentEntity.getId() > 0) {

            orderResponse.setOrderId(responseEntity.getOrderId());
            orderResponse.setCustomerId(responseEntity.getCustomerId());
            orderResponse.setTotalAmount(amount);
            orderResponse.setPaymentStatus("success");
            orderResponse.setOrderStatus("Placed");

        } else {

            orderResponse.setOrderId(responseEntity.getOrderId());
            orderResponse.setCustomerId(responseEntity.getCustomerId());
            orderResponse.setTotalAmount(amount);
            orderResponse.setPaymentStatus("FAILED");
            orderResponse.setOrderStatus("ON HOLD");
        }

        System.out.println("OrderService.acceptOrder() ::::::::: END");

        return orderResponse;
    }

    // Generate Order ID
    private int generateOrderID() {

        Random random = new Random();

        int id = 10000 + random.nextInt(90000);

        return id;
    }

    // Generate Order Amount
    private int generateAmount() {

        Random random = new Random();

        int amount = 1000 + random.nextInt(9000);

        return amount;
    }

    // Generate Payment Reference
    private String generatePaymentRef() {

        Random random = new Random();

        String ref = "REF" + 100 + random.nextInt(900);

        return ref;
    }
}

