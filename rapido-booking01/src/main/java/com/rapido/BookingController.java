package com.rapido;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

	@GetMapping("showBookingPage")
	public String showBookPage()
	{
		
		return "booking-page";
	}
}
