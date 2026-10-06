package com.kodwal.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.kodwal.order.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

}
