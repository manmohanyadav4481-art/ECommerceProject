package com.programe.oops.inherit.pract;
/*
import java.util.ArrayList;

import java.util.*;

//🔷 Product Class
class Product {
 String name;
 int price;

 Product(String name, int price) {
     this.name = name;
     this.price = price;
 }

 void display() {
     System.out.println(name + " - ₹" + price);
 }
}

//🔷 Cart Class
class Cart {
 List<Product> products = new ArrayList<>();

 void addProduct(Product p) {
     products.add(p);
     System.out.println(p.name + " added to cart");
 }

 int getTotalAmount() {
     int total = 0;
     for (Product p : products) {
         total += p.price;
     }
     return total;
 }

 void showCart() {
     System.out.println("\n--- Cart Items ---");
     for (Product p : products) {
         p.display();
     }
     System.out.println("Total Amount: ₹" + getTotalAmount());
 }
}

//🔷 Payment (Polymorphism)
abstract class Payment {
 abstract void pay(int amount);
}

//UPI Payment
class UPI extends Payment {
 void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using UPI ✅");
 }
}

//Card Payment
class Card extends Payment {
 void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using Card 💳");
 }
}

//Cash Payment
class Cash extends Payment {
 void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using Cash 💵");
 }
}

//🔷 Main Class (Simulation)
public class Products {
 public static void main(String[] args) {

     // Create Products
     Product p1 = new Product("Mobile App", 200);
     Product p2 = new Product("Game Pass", 500);
     Product p3 = new Product("E-Book", 300);

     // Create Cart
     Cart cart = new Cart();

     // Add Products
     cart.addProduct(p1);
     cart.addProduct(p2);
     cart.addProduct(p3);

     // Show Cart
     cart.showCart();

     // Apply Discount (10%)
     int total = cart.getTotalAmount();
     int discount = (total * 10) / 100;
     int finalAmount = total - discount;

     System.out.println("\nDiscount: ₹" + discount);
     System.out.println("Final Amount: ₹" + finalAmount);

     // Choose Payment Method (Polymorphism)
     Payment payment;

     // Change this line to test different payments
     payment = new UPI();
     // payment = new Card();
     // payment = new Cash();

     payment.pay(finalAmount);
 }
}
*/
import java.util.*;

//🔷 User Class (Encapsulation)
class User {
 private String username;
 private String password;

 User(String username, String password) {
     this.username = username;
     this.password = password;
 }

 public boolean login(String u, String p) {
     return username.equals(u) && password.equals(p);
 }
}

//🔷 Product Class
class Product {
 int id;
 String name;
 int price;

 Product(int id, String name, int price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 void display() {
     System.out.println(id + ". " + name + " - ₹" + price);
 }
}

//🔷 Cart Class
class Cart {
 List<Product> items = new ArrayList<>();

 void addProduct(Product p) {
     items.add(p);
     System.out.println(p.name + " added to cart");
 }

 int getTotal() {
     int total = 0;
     for (Product p : items) {
         total += p.price;
     }
     return total;
 }

 void showCart() {
     System.out.println("\n--- Your Cart ---");
     for (Product p : items) {
         p.display();
     }
     System.out.println("Total: ₹" + getTotal());
 }
}

//🔷 Payment (Abstraction + Polymorphism)
abstract class Payment {
 abstract void pay(int amount);
}

class UPI extends Payment {
 void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using UPI ✅");
 }
}

class Card extends Payment {
 void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using Card 💳");
 }
}

//🔷 Order Class
class Order {
 static int orderIdCounter = 1001;
 int orderId;
 int amount;

 Order(int amount) {
     this.orderId = orderIdCounter++;
     this.amount = amount;
 }

 void generateInvoice() {
     System.out.println("\n===== INVOICE =====");
     System.out.println("Order ID: " + orderId);
     System.out.println("Amount Paid: ₹" + amount);
     System.out.println("Status: SUCCESS");
     System.out.println("===================");
 }
}

//🔷 Main App
public class Products {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Predefined User
     User user = new User("admin", "1234");

     System.out.println("==== AMAZON LOGIN ====");
     System.out.print("Enter Username: ");
     String u = sc.next();
     System.out.print("Enter Password: ");
     String p = sc.next();

     if (!user.login(u, p)) {
         System.out.println("Invalid Login ❌");
         return;
     }

     System.out.println("Login Successful ✅");

     // Products
     Product p1 = new Product(1, "Laptop", 50000);
     Product p2 = new Product(2, "Headphones", 2000);
     Product p3 = new Product(3, "Keyboard", 1500);

     List<Product> productList = Arrays.asList(p1, p2, p3);

     Cart cart = new Cart();

     // Product Selection
     while (true) {
         System.out.println("\n--- Products ---");
         for (Product prod : productList) {
             prod.display();
         }

         System.out.println("4. Checkout");
         System.out.print("Choose product: ");
         int choice = sc.nextInt();

         if (choice == 4) break;

         for (Product prod : productList) {
             if (prod.id == choice) {
                 cart.addProduct(prod);
             }
         }
     }

     cart.showCart();

     // Discount
     int total = cart.getTotal();
     int discount = (total * 10) / 100;
     int finalAmount = total - discount;

     System.out.println("Discount: ₹" + discount);
     System.out.println("Final Amount: ₹" + finalAmount);

     // Payment
     System.out.println("\nSelect Payment Method:");
     System.out.println("1. UPI");
     System.out.println("2. Card");

     int payChoice = sc.nextInt();

     Payment payment;

     if (payChoice == 1) {
         payment = new UPI();
     } else {
         payment = new Card();
     }

     payment.pay(finalAmount);

     // Order + Invoice
     Order order = new Order(finalAmount);
     order.generateInvoice();

     sc.close();
 }
}