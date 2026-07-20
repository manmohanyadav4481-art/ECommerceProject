package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.ecommerce.dao.OrderDAO;

public class OrderDAOTest 
{

	@Test
	void testPlaceOrder() {
	    OrderDAO dao = new OrderDAO();
	    assertDoesNotThrow(() -> dao.placeOrder(1));
	}

	@Test
	void testViewOrders() {
	    OrderDAO dao = new OrderDAO();
	    assertDoesNotThrow(() -> dao.viewOrders(1));
	}
	
}
