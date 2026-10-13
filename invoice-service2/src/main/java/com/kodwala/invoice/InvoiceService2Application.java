package com.kodwala.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class InvoiceService2Application {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceService2Application.class, args);
	}

}
