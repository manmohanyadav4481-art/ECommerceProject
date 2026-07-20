package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.dao.CartDAO;

public class CartDAOTest {

    private CartDAO dao;

    @BeforeEach
    void setup() {
        dao = new CartDAO();
    }

    @Test
    void testAddToCart() {
        assertTrue(dao.addToCart(1, 1, 1));
    }

    @Test
    void testRemoveFromCart() {
        dao.addToCart(1, 1, 1);
        assertDoesNotThrow(()-> { dao.removeFromCart(1);});
    }

    @Test
    void testViewCart() {
        assertDoesNotThrow(() -> dao.viewCart(1));
    }
}