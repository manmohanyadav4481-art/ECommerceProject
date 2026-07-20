package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.dao.ProductDAO;

public class ProductDAOTest {

    private ProductDAO dao;

    @BeforeEach
    void setup() {
        dao = new ProductDAO();
    }

    @Test
    void testViewProducts() {
        assertFalse(dao.viewProducts().isEmpty());
    }

    @Test
    void testSearchProduct() {
        assertNotNull(dao.searchProduct(1));
    }

    @Test
    void testSearchInvalidProduct() {
        assertNull(dao.searchProduct(9999));
    }
}