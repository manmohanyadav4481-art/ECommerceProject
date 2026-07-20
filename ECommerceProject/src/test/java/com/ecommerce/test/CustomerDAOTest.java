package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.model.Customer;

public class CustomerDAOTest {

    private CustomerDAO dao;

    @BeforeEach
    public void setup() {
        dao = new CustomerDAO();
    }

    @Test
    public void testRegister() {

        Customer customer = new Customer();

        customer.setCustomerName("Test User");
        customer.setEmail("testuser"+System.currentTimeMillis()+"@gmail.com");
        customer.setPassword("123456");
        customer.setMobile("9999999999");
        customer.setAddress("Bangalore");

        assertTrue(dao.register(customer));
    }

    @Test
    public void testLoginSuccess() {

        Customer customer = dao.login("manmohan@gmail.com", "654321");

        assertNotNull(customer);
    }

    @Test
    public void testLoginFailure() {

        Customer customer = dao.login("wrong@gmail.com", "wrong");

        assertNull(customer);
    }

    @Test
    public void testResetPassword() {

        boolean result = dao.resetPassword("manmohan@gmail.com", "654321");

        assertTrue(result);
    }

    @Test
    public void testGetCustomerById() {

        Customer customer = dao.getCustomerById(1);

        System.out.println(customer);
        
        assertNotNull(customer);
    }
}