package com.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ecommerce.entity.CustomerEntity;
import com.ecommerce.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Create Customer
    @PostMapping
    public CustomerEntity createCustomer(
            @RequestBody CustomerEntity customer) {

        return customerService.createCustomer(customer);
    }

    // Get All Customers
    @GetMapping
    public List<CustomerEntity> getAllCustomers() {

        return customerService.getAllCustomers();
    }
}
/*
    // Get Customer By ID
    @GetMapping("/{id}")
    public CustomerEntity getCustomerById(
            @PathVariable int id) {

        return customerService.getCustomerById(id);
    }
}
    */