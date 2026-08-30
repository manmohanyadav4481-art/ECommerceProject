package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderController 
{

	@GetMapping("/orders/{id}")
	public String getOrder(@PathVariable("id")  String ordrid)
	{
		System.out.println("order id recevid from page is : "+ordrid);
		return "order-details";
	}
}


