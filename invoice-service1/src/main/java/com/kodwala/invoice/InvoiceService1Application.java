package com.kodwala.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kodewala.invoice", "com.kodwala.invoice"})
@EntityScan(basePackages = {"com.kodewala.invoice.entity", "com.kodwala.invoice.entity"})
@EnableJpaRepositories(basePackages = {"com.kodewala.invoice.repository", "com.kodwala.invoice.repository"})
public class InvoiceService1Application {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceService1Application.class, args);
    }

}