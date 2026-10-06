package com.kodwala.order.service;

import org.springframework.stereotype.Service;

import com.kodwala.order.entity.OrderEntity;
import com.kodwala.order.repository.OrderRepository;
import com.kodwala.order.request.OrderRequest;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderEntity createOrder(OrderRequest request) {

        OrderEntity order = new OrderEntity();

        order.setCustomerId(request.getCustomerId());
        order.setCustomerName(request.getCustomerName());
        order.setProductId(request.getProductId());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setAmount(request.getAmount());
        order.setDeliveryAddress(request.getDeliveryAddress());

        order.setStatus("CREATED");

        return orderRepository.save(order);
    }
}