
package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.entity.CustomerEntity;

public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Integer> {

    @Query("SELECT DISTINCT c FROM CustomerEntity c LEFT JOIN FETCH c.orders")
    List<CustomerEntity> findAllWithOrders();

    @Override
    @EntityGraph(attributePaths = "orders")
    List<CustomerEntity> findAll();
}

