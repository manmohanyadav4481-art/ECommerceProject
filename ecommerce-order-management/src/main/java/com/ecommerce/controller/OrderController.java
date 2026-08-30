
package com.ecommerce.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.OrderEntity;
import com.ecommerce.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Create Order
    @PostMapping("/customer/{customerId}")
    public OrderEntity createOrder(
            @PathVariable int customerId,
            @RequestBody OrderEntity order) {

        return orderService.createOrder(customerId, order);
    }

    // Get Orders by Customer ID
    @GetMapping("/customer/{customerId}")
    public Page<OrderEntity> getCustomerOrders(
            @PathVariable int customerId,
            Pageable pageable) {

        return orderService.getCustomerOrders(
                customerId,
                pageable
        );
    }
}
