
package com.ecommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.OrderEntity;

public interface OrderRepository
        extends JpaRepository<OrderEntity, Integer> {

    Page<OrderEntity> findByCustomerId(
            int customerId,
            Pageable pageable
    );
}
