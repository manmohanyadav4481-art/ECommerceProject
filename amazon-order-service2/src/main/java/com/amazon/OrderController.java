package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderController {

	@GetMapping("/orders/{id}")
	public String getOrder (@PathVariable("id") String orderId)
	{
		System.out.println("Order id received from page is : "+orderId);
		return "order-details";  // view Resolver
	}
}
