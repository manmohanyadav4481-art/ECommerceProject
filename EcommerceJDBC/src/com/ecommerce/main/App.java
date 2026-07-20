package com.ecommerce.main;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.ecommerce.dao.CartDAO;
import com.ecommerce.dao.OrderDAO;
import com.ecommerce.dao.ProductDAO;


public class App 
{
    @Test
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ProductDAO deo = new ProductDAO();
		CartDAO cart = new CartDAO();
		OrderDAO orderDAO = new OrderDAO();
		
		
		
		while (true) {
			
			System.out.println("\n========E-Commerce Management System =============");
			
			System.out.println("1. View Products");
			System.out.println("2. Add To Cart");
		    System.out.println("3. View Cart");
		    System.out.println("4. Remove From Cart");
		    System.out.println("5. Place Order");
		    System.out.println("6. View Orders");
		    System.out.println("7. View Orders Items");
		    System.out.println("8. Exit");
		    
		    System.out.println("Enter the your choice : ");
		    int choice =sc.nextInt();
		    
		    
		    switch (choice) {
		    
		    case 1:
		    	deo.viewProducts();
		    	break;
		    	
		    case 2:
		    	System.out.println("Customer ID: ");
		    	int customerId =sc.nextInt();
		    	
		    	System.out.println("Product ID: ");
		    	int productId = sc.nextInt();
		    	
		    	System.out.println("Quantity:");
		    	int quantity = sc.nextInt();
		    	
		       cart.addToCart(customerId, productId, quantity);
		       break;
		    
		    case 3:
		    	System.out.println("Customer ID: ");
		    	customerId = sc.nextInt();
		    	
		    	cart.viewCart(customerId);
		    	break;
		    	
		    case 4:
		    	
		    	System.out.println("Cart ID :");
		    	int cartID = sc.nextInt();
		    	
		    	cart.removeFromCart(cartID);
		    	break;
		    	
		   case 5:
			   
			   System.out.println("Customer ID:");
			   
			   customerId =sc.nextInt();
			   
			   orderDAO.placeOrder(customerId);
			   break;
			   
		   case 6:
			   System.out.println("Customer ID : ");
			   customerId = sc.nextInt();
			   
			   orderDAO.viewOrders(customerId);
			   break;
			   
		   case 7:
			   System.out.println("Order ID");
			   int orderId =sc.nextInt();
			   
			   orderDAO.viewOrderItems(orderId);
			   break;
			   
		   case 8:
			   System.out.println("Thank you");
			   sc.close();
			   System.exit(0);
			   break;
			   
			   default:
				   System.out.println("Invalid Choice!");
		    }
		    
		}
	}
}
