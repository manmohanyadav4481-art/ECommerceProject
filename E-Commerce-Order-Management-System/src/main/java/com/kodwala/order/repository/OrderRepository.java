package com.kodwala.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodwala.order.entity.OrderEntity;
@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

}
