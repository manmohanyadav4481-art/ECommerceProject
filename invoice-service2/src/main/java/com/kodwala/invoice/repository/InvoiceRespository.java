package com.kodwala.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodwala.invoice.entity.InvoiceEntity;

@Repository
public interface InvoiceRespository extends JpaRepository<InvoiceEntity, Integer>
{

}