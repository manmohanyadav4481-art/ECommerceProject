package com.rapido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookingController {

	@GetMapping("showBookingPage")
	public String showBookPage() {
		return "booking-page";
	}
	
	public String acceptBooking (@ModelAttribute BookingRequest bookingRequest, Model model )  
	
	{
	
		System.out.println("Mobile     : "+boo);
	}
	
}
