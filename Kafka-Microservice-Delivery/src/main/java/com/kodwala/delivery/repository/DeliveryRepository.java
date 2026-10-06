
package com.kodwala.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.kodwala.delivery.entity.DeliveryEntity;

public interface DeliveryRepository
        extends CrudRepository<DeliveryEntity, Long> {

}

