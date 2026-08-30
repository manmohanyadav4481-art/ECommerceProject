
package com.ecommerce.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.CustomerEntity;
import com.ecommerce.entity.OrderEntity;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final CustomerRepository customerRepository;

    public OrderService(OrderRepository orderRepository,
                        CustomerRepository customerRepository) {

        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    // Create Order for Customer
    public OrderEntity createOrder(int customerId, OrderEntity order) {

        CustomerEntity customer = customerRepository
                .findById(customerId)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Customer not found with id: " + customerId
                    )
                );

        order.setCustomer(customer);

        return orderRepository.save(order);
    }

    // Get Orders by Customer ID with Pagination
    public Page<OrderEntity> getCustomerOrders(
            int customerId,
            Pageable pageable) {

        return orderRepository.findByCustomerId(
                customerId,
                pageable
        );
    }
}
