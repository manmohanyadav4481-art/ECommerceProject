package com.ecommerce;

import java.util.Scanner;

import com.ecommerce.dao.CartDAO;
import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.dao.OrderDAO;
import com.ecommerce.dao.PaymentDAO;
import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDAO customerDAO = new CustomerDAO();
        ProductDAO productDAO = new ProductDAO();
        CartDAO cartDAO = new CartDAO();
        OrderDAO orderDAO = new OrderDAO();
       PaymentDAO paymentDAO = new PaymentDAO();

        Customer customer = null;

        while (true) {

            System.out.println("\n========= E-COMMERCE =========");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. View Products");
            System.out.println("4. Add To Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Place Order");
            System.out.println("7. Make Payment");
            System.out.println("8. Order History");
            System.out.println("9. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Name : ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Email : ");
                String email = sc.nextLine();

                System.out.print("Password : ");
                String password = sc.nextLine();

                System.out.print("Mobile : ");
                String mobile = sc.nextLine();

                System.out.print("Address : ");
                String address = sc.nextLine();

                Customer newCustomer = new Customer();
                newCustomer.setCustomerName(name);
                newCustomer.setEmail(email);
                newCustomer.setPassword(password);
                newCustomer.setMobile(mobile);
                newCustomer.setAddress(address);

                if (customerDAO.register(newCustomer)) {
                    System.out.println("Registration Successful");
                } else {
                    System.out.println("Registration Failed");
                }
                break;

            case 2:

                sc.nextLine();

                System.out.print("Email : ");
                email = sc.nextLine();

                System.out.print("Password : ");
                password = sc.nextLine();

                customer = customerDAO.login(email, password);

                if (customer != null) {
                    System.out.println("Welcome " + customer.getCustomerName());
                } else {
                    System.out.println("Invalid Email or Password");
                }

                break;

            case 3:

                for (Product p : productDAO.viewProducts()) {

                    System.out.println(
                            p.getProductId() + " "
                            + p.getProductName() + " ₹"
                            + p.getPrice() + " Stock:"
                            + p.getStock());
                }

                break;

            case 4:

                if (customer == null) {
                    System.out.println("Please Login First");
                    break;
                }

                System.out.print("Product ID : ");
                int productId = sc.nextInt();

                System.out.print("Quantity : ");
                int qty = sc.nextInt();

                cartDAO.addToCart(customer.getCustomerId(), productId, qty);

                break;

            case 5:

                if (customer == null) {
                    System.out.println("Please Login First");
                    break;
                }

                cartDAO.viewCart(customer.getCustomerId());

                break;

            case 6:

                if (customer == null) {
                    System.out.println("Please Login First");
                    break;
                }

                if (orderDAO.placeOrder(customer.getCustomerId())) {
                    System.out.println("Order Placed Successfully");
                } else {
                    System.out.println("Order Failed");
                }

                break;

            case 7:

                int latestOrderId = orderDAO.getLastOrderId();

                sc.nextLine();

                System.out.print("Payment Method (UPI/Card/Cash): ");
                String method = sc.nextLine();

                if (paymentDAO.makePayment(latestOrderId, method)) {
                    System.out.println("Payment Completed");
                } else {
                    System.out.println("Payment Failed");
                }

                break;

            case 8:

                if (customer == null) {
                    System.out.println("Please Login First");
                    break;
                }

                orderDAO.viewOrders(customer.getCustomerId());

                break;

            case 9:

                System.out.println("Thank You...");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}