package com.zepto.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse getOrderById(int orderId) {

        System.out.println("OrderService.getOrderById() START");
        System.out.println("Searching orderId = " + orderId);

        OrderEntity entity = orderRepository.findByOrderId(orderId);

        if (entity == null) {
            System.out.println("Order not found: " + orderId);
            return null;
        }

        OrderResponse response = new OrderResponse();

        response.setId(entity.getId());
        response.setOrderId(entity.getOrderId());
        response.setCustomerId(entity.getCustomerId());
        response.setProductId(entity.getProductId());
        response.setQuantity(entity.getQuantity());

        System.out.println("Order found successfully");

        return response;
    }
}