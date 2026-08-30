package com.zepto.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    // =========================================================
    // SEARCH ORDER BY ORDER ID
    // =========================================================

    public OrderResponse getOrderById(int orderId) {

        System.out.println("======================================");
        System.out.println("OrderService.getOrderById() START");
        System.out.println("Searching orderId = " + orderId);

        // Search using order_id column
        OrderEntity entity = orderRepository.findByOrderId(orderId);

        // If order not found
        if (entity == null) {

            System.out.println("Order not found: " + orderId);
            System.out.println("OrderService.getOrderById() END");

            return null;
        }

        // Convert Entity to Response
        OrderResponse response = new OrderResponse();

        response.setId(entity.getId());
        response.setOrderId(entity.getOrderId());
        response.setCustomerId(entity.getCustomerId());
        response.setProductId(entity.getProductId());
        response.setQuantity(entity.getQuantity());
        response.setPaymentMethod(entity.getPaymentMethod());
        response.setShippingAddress(entity.getShippingAddress());

        System.out.println("Order found successfully");
        System.out.println("Order ID = " + entity.getOrderId());
        System.out.println("======================================");

        return response;
    }


    // =========================================================
    // SEARCH ORDER BY PAYMENT TYPE
    // =========================================================

    public List<OrderResponse> listOrderByPayment(String paymentType) {

        System.out.println("======================================");
        System.out.println("OrderService.listOrderByPayment() START");
        System.out.println("Searching paymentType = " + paymentType);

        // Get orders from repository
        List<OrderEntity> orderEntities =
                orderRepository.findOrderByPaymentType(paymentType);

        // Create response list
        List<OrderResponse> response =
                new ArrayList<OrderResponse>();

        // Convert Entity to Response
        for (OrderEntity entity : orderEntities) {

            OrderResponse orderResponse =
                    new OrderResponse();

            orderResponse.setId(entity.getId());
            orderResponse.setOrderId(entity.getOrderId());
            orderResponse.setCustomerId(entity.getCustomerId());
            orderResponse.setProductId(entity.getProductId());
            orderResponse.setQuantity(entity.getQuantity());
            orderResponse.setPaymentMethod(entity.getPaymentMethod());
            orderResponse.setShippingAddress(entity.getShippingAddress());

            response.add(orderResponse);
        }

        System.out.println("Total orders found = " + response.size());
        System.out.println("OrderService.listOrderByPayment() END");
        System.out.println("======================================");

        return response;
    }
}