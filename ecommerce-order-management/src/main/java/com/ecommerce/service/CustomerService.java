
package com.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.CustomerEntity;
import com.ecommerce.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create Customer
    public CustomerEntity createCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    // Get All Customers
    public List<CustomerEntity> getAllCustomers() {

        List<CustomerEntity> customers =
                customerRepository.findAll();

        for (CustomerEntity customer : customers) {

            System.out.println(
                "Customer: " + customer.getName()
                + " | Orders: " + customer.getOrders().size()
            );
        }

        return customers;
    }

    // Get Customer By ID
    public CustomerEntity getCustomerById(int id) {

        CustomerEntity customer = customerRepository.findById(id)
                .orElse(null);

        if (customer != null) {
            System.out.println("Customer loaded");
            System.out.println(
                "Number of orders: " + customer.getOrders().size()
            );
        }

        return customer;
    }
}
