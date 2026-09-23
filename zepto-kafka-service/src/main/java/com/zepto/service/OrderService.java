package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.entity.PaymentEntity;
import com.zepto.kafka.service.KafkaService;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.payment.repository.PaymentRepository;
import com.zepto.repository.OrderRepository;

import jakarta.transaction.Transactional;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private KafkaService kafkaService;

    @Transactional
    public OrderResponse acceptOrder(OrderRequest orderRequest) {

        System.out.println("========================================");
        System.out.println("OrderService.acceptOrder() ::::: START");
        System.out.println("========================================");

        // ==========================================
        // 1. Create Order
        // ==========================================

        OrderEntity entity = new OrderEntity();

        entity.setCustomerId(orderRequest.getCustomerId());
        entity.setPaymentMethod(orderRequest.getPaymentMethod());
        entity.setProductId(orderRequest.getProductId());
        entity.setQuantity(orderRequest.getQuantity());
        entity.setShippingAddress(orderRequest.getShippingAddress());

        // Generate Order ID
        entity.setOrderId(generateOrderID());

        // Initial order status
        entity.setStatus("PENDING");

        // Save Order
        OrderEntity responseEntity = orderRepository.save(entity);

        System.out.println("Order saved successfully");
        System.out.println("Order ID: " + responseEntity.getOrderId());
        System.out.println("Order Status: " + responseEntity.getStatus());

        // ==========================================
        // 2. Create Payment
        // ==========================================

        PaymentEntity paymentEntity = new PaymentEntity();

        int amount = generateAmount();

        paymentEntity.setAmount(amount);
        paymentEntity.setPaymentRef(generatePaymentRef());

        System.out.println("Payment Amount: " + amount);
        System.out.println(
                "Payment Reference: "
                        + paymentEntity.getPaymentRef()
        );

        // ==========================================
        // 3. Payment Success / Failed
        // ==========================================

        if ("FAILED".equalsIgnoreCase(
                orderRequest.getPaymentStatus())) {

            paymentEntity.setStatus("FAILED");

            System.out.println("Payment Status: FAILED");

        } else {

            paymentEntity.setStatus("PAID");

            System.out.println("Payment Status: PAID");
        }

        // ==========================================
        // 4. Save Payment
        // ==========================================

        PaymentEntity responsePaymentEntity =
                paymentRepository.save(paymentEntity);

        System.out.println("Payment saved successfully");

        System.out.println(
                "Payment Status: "
                        + responsePaymentEntity.getStatus()
        );

        // ==========================================
        // 5. Create Response
        // ==========================================

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setOrderId(
                responseEntity.getOrderId()
        );

        orderResponse.setCustomerId(
                responseEntity.getCustomerId()
        );

        orderResponse.setTotalAmount(amount);

        // ==========================================
        // 6. Check Payment Result
        // ==========================================

        if ("PAID".equalsIgnoreCase(
                responsePaymentEntity.getStatus())) {

            // ==========================================
            // PAYMENT SUCCESS
            // ==========================================

            orderResponse.setPaymentStatus("success");
            orderResponse.setOrderStatus("Placed");

            // Update Order Status
            responseEntity.setStatus("PAID");

            orderRepository.save(responseEntity);

            System.out.println("Payment successful");
            System.out.println("Order Status: PAID");
            System.out.println("Order placed successfully");

            // ==========================================
            // 7. Convert OrderResponse -> JSON
            // ==========================================

            String data = objToJson(orderResponse);

            System.out.println("========================================");
            System.out.println("JSON DATA");
            System.out.println("========================================");
            System.out.println(data);

            // ==========================================
            // 8. Send JSON to Kafka
            // ==========================================

            System.out.println(
                    "Sending JSON message to Kafka topic: Order-paid"
            );

            kafkaService.sendMessage(
                    "Order-paid",
                    data
            );

            System.out.println(
                    "Kafka JSON message sent for Order ID: "
                            + responseEntity.getOrderId()
            );

        } else {

            // ==========================================
            // PAYMENT FAILED
            // ==========================================

            orderResponse.setPaymentStatus("FAILED");
            orderResponse.setOrderStatus("ON HOLD");

            // Update Order Status
            responseEntity.setStatus("PAYMENT_FAILED");

            orderRepository.save(responseEntity);

            System.out.println("Payment failed");
            System.out.println("Order Status: PAYMENT_FAILED");
            System.out.println("Order is ON HOLD");
        }

        System.out.println("========================================");
        System.out.println("OrderService.acceptOrder() ::::: END");
        System.out.println("========================================");

        return orderResponse;
    }

    // ==========================================
    // Generate Order ID
    // ==========================================

    private int generateOrderID() {

        Random random = new Random();

        return 10000 + random.nextInt(90000);
    }

    // ==========================================
    // Generate Amount
    // ==========================================

    private int generateAmount() {

        Random random = new Random();

        return 1000 + random.nextInt(9000);
    }

    // ==========================================
    // Generate Payment Reference
    // ==========================================

    private String generatePaymentRef() {

        Random random = new Random();

        return "REF" + (100 + random.nextInt(900));
    }

    // ==========================================
    // Object -> JSON
    // ==========================================

    private String objToJson(OrderResponse response) {

        try {

            ObjectMapper objectMapper = new ObjectMapper();

            String json =
                    objectMapper.writeValueAsString(response);

            return json;

        } catch (JacksonException e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Failed to convert OrderResponse to JSON",
                    e
            );
        }
    }
}