package com.kodwal.order.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kodwal.order.dto.OrderRequest;
import com.kodwal.order.dto.OrderResponse;
import com.kodwal.order.entity.OrderEntity;
import com.kodwal.order.kafka.OrderCreatedEvent;
import com.kodwal.order.kafka.OrderKafkaProducer;
import com.kodwal.order.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderKafkaProducer orderKafkaProducer;

    public OrderService(
            OrderRepository orderRepository,
            OrderKafkaProducer orderKafkaProducer) {

        this.orderRepository = orderRepository;
        this.orderKafkaProducer = orderKafkaProducer;
    }

    public OrderResponse createOrder(OrderRequest request) {

        // =====================================================
        // CREATE ORDER
        // =====================================================

        OrderEntity order = new OrderEntity();

        order.setCustomerid(request.getCustomerId());
        order.setCustomerName(request.getCustomerName());
        order.setProductId(request.getProductId());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setAmount(request.getAmount());
        order.setDeliveryAddress(request.getDeliveryAddress());
        order.setStatus("CREATED");

        // =====================================================
        // SAVE ORDER
        // =====================================================

        OrderEntity savedOrder = orderRepository.save(order);

        // =====================================================
        // CREATE ORDER_CREATED EVENT
        // =====================================================

        OrderCreatedEvent event =
                new OrderCreatedEvent(
                        UUID.randomUUID().toString(),
                        "ORDER_CREATED",
                        savedOrder.getId(),
                        savedOrder.getCustomerid(),
                        savedOrder.getAmount(),
                        savedOrder.getDeliveryAddress()
                );

        // =====================================================
        // ORDER CONSOLE OUTPUT
        // =====================================================

        System.out.println();
        System.out.println("================================================");
        System.out.println("          ORDER CREATED SUCCESSFULLY");
        System.out.println("================================================");
        System.out.println("Order ID          : " + savedOrder.getId());
        System.out.println("Customer ID       : " + savedOrder.getCustomerid());
        System.out.println("Amount            : " + savedOrder.getAmount());
        System.out.println("Delivery Address  : " + savedOrder.getDeliveryAddress());
        System.out.println("Order Status      : " + savedOrder.getStatus());
        System.out.println("Event             : ORDER_CREATED");
        System.out.println("================================================");
        System.out.println();

        // =====================================================
        // PUBLISH ORDER_CREATED
        // =====================================================

        orderKafkaProducer.publishOrderCreated(event);

        return new OrderResponse(
                savedOrder.getId(),
                savedOrder.getStatus()
        );
    }
}