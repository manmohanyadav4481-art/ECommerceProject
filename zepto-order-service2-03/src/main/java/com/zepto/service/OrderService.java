
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

        // ==============================
        // 1. Create Order
        // ==============================

        OrderEntity entity = new OrderEntity();

        entity.setCustomerId(orderRequest.getCustomerId());
        entity.setPaymentMethod(orderRequest.getPaymentMethod());
        entity.setProductId(orderRequest.getProductId());
        entity.setQuantity(orderRequest.getQuantity());
        entity.setShippingAddress(orderRequest.getShippingAddress());

        // Generate Order ID
        entity.setOrderId(generateOrderID());

        // Save Order
        OrderEntity responseEntity = orderRepository.save(entity);

        System.out.println("Order saved successfully");
        System.out.println("Order ID: " + responseEntity.getOrderId());

        // ==============================
        // 2. Create Payment
        // ==============================

        PaymentEntity paymentEntity = new PaymentEntity();

        // Generate Amount
        int amount = generateAmount();

        paymentEntity.setAmount(amount);

        // Generate Payment Reference
        paymentEntity.setPaymentRef(generatePaymentRef());

        // ==============================
        // 3. Payment Success / Failed
        // ==============================

        if ("FAILED".equalsIgnoreCase(orderRequest.getPaymentStatus())) {

            paymentEntity.setStatus("FAILED");

            System.out.println("Payment Status: FAILED");

        } else {

            paymentEntity.setStatus("PAID");

            System.out.println("Payment Status: PAID");
        }

        // Save Payment
        PaymentEntity responsePaymentEntity =
                paymentRepository.save(paymentEntity);

        // ==============================
        // 4. Create Response
        // ==============================

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setOrderId(responseEntity.getOrderId());
        orderResponse.setCustomerId(responseEntity.getCustomerId());
        orderResponse.setTotalAmount(amount);

        // ==============================
        // 5. Check Payment Result
        // ==============================

        if ("PAID".equalsIgnoreCase(responsePaymentEntity.getStatus())) {

            // Payment SUCCESS

            orderResponse.setPaymentStatus("success");
            orderResponse.setOrderStatus("Placed");

            System.out.println("Payment successful");
            System.out.println("Order placed successfully");

        } else {

            // Payment FAILED

            orderResponse.setPaymentStatus("FAILED");
            orderResponse.setOrderStatus("ON HOLD");

            System.out.println("Payment failed");
            System.out.println("Order is ON HOLD");
        }

        System.out.println("OrderService.acceptOrder() ::::::::: END");

        return orderResponse;
    }

    // ==============================
    // Generate Order ID
    // ==============================

    private int generateOrderID() {

        Random random = new Random();

        int id = 10000 + random.nextInt(90000);

        return id;
    }

    // ==============================
    // Generate Amount
    // ==============================

    private int generateAmount() {

        Random random = new Random();

        int amount = 1000 + random.nextInt(9000);

        return amount;
    }

    // ==============================
    // Generate Payment Reference
    // ==============================

    private String generatePaymentRef() {

        Random random = new Random();

        String ref = "REF" + 100 + random.nextInt(900);

        return ref;
    }
}

