package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ecommerce.dao.PaymentDAO;

public class PaymentDAOTest {

    PaymentDAO dao = new PaymentDAO();

    @Test
    public void testMakePayment() {

        // Use an unpaid order ID
        int orderId = 16;   // Replace with a valid unpaid order

        boolean result = dao.makePayment(orderId, "UPI");

        assertTrue(result);
    }

    @Test
    public void testMakePayment1() {

        assertDoesNotThrow(() -> {
            dao.makePayment(16, "UPI");
        });
    }
    
}