package com.kodwala.payment.repository;

import org.springframework.data.repository.CrudRepository;

import com.kodwala.payment.entity.PaymentEntity;

public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

}
