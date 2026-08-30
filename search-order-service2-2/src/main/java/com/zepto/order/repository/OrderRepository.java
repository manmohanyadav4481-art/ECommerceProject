package com.zepto.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zepto.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {

    // Search by orderId
    // SQL: SELECT * FROM orders WHERE order_id = ?
    OrderEntity findByOrderId(int orderId);

    // Search orders by payment type and quantity less than 2
    @Query(value = "SELECT * FROM orders " +
                   "WHERE payment_method = :type " +
                   "AND quantity < 2",
           nativeQuery = true)
    List<OrderEntity> findOrderByPaymentType(
            @Param("type") String paymentType);
}