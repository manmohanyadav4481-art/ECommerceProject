package com.kodwala.notification.repository;

import org.springframework.data.repository.CrudRepository;

import com.kodwala.notification.entity.NotificationEntity;

public interface NotificationRepository
        extends CrudRepository<NotificationEntity, Long> {

}