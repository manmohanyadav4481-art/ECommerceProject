package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecommerce.model.Customer;
import com.ecommerce.util.DBConnection;

public class CustomerDAO {

    // Register Customer
    public boolean register(Customer customer) {

        String sql = "INSERT INTO customers(customer_name,email,password,mobile,address) VALUES(?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getMobile());
            ps.setString(5, customer.getAddress());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Login
    public Customer login(String email, String password) {

        String sql = "SELECT * FROM customers WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Customer customer = new Customer();

                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setCustomerName(rs.getString("customer_name"));
                customer.setEmail(rs.getString("email"));
                customer.setMobile(rs.getString("mobile"));
                customer.setAddress(rs.getString("address"));

                return customer;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Reset Password
    public boolean resetPassword(String email, String newPassword) {

        String sql = "UPDATE customers SET password=? WHERE email=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newPassword);
            ps.setString(2, email);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Get Customer By Id
    public Customer getCustomerById(int customerId) {

        String sql = "SELECT * FROM customers WHERE customer_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Customer customer = new Customer();

                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setCustomerName(rs.getString("customer_name"));
                customer.setEmail(rs.getString("email"));
                customer.setMobile(rs.getString("mobile"));
                customer.setAddress(rs.getString("address"));

                return customer;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}