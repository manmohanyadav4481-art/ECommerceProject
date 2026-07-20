package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ecommerce.util.DBConnection;

public class PaymentDAO {

    // Make Payment
    public boolean makePayment(int orderId, String paymentMethod) {

        String amountSql = "SELECT total_amount FROM orders WHERE order_id=?";

        String paymentSql =
                "INSERT INTO payments(order_id,payment_method,amount,payment_status) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection()) {

            // Get Order Amount
            PreparedStatement psAmount = con.prepareStatement(amountSql);
            psAmount.setInt(1, orderId);

            ResultSet rs = psAmount.executeQuery();

            if (!rs.next()) {
                System.out.println("Order Not Found");
                return false;
            }

            double amount = rs.getDouble("total_amount");

            // Insert Payment
            PreparedStatement ps = con.prepareStatement(paymentSql);

            ps.setInt(1, orderId);
            ps.setString(2, paymentMethod);
            ps.setDouble(3, amount);
            ps.setString(4, "SUCCESS");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Payment Successful");
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // Payment History
    public void paymentHistory(int customerId) {

        String sql = """
                SELECT p.payment_id,
                       p.order_id,
                       p.payment_method,
                       p.amount,
                       p.payment_status
                FROM payments p
                JOIN orders o
                ON p.order_id = o.order_id
                WHERE o.customer_id = ?
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n===== PAYMENT HISTORY =====");

            while (rs.next()) {

                System.out.println(
                        "Payment ID : " + rs.getInt("payment_id")
                        + " | Order ID : " + rs.getInt("order_id")
                        + " | Method : " + rs.getString("payment_method")
                        + " | Amount : ₹" + rs.getDouble("amount")
                        + " | Status : " + rs.getString("payment_status"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}