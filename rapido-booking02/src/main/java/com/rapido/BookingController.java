package com.rapido;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.BookingRequest;

@Controller
public class BookingController {

	@GetMapping("showBookingPage")
	public String showBookPage()
	{
		
		return "booking-page";
	}
	
	@PostMapping("bookRide")
	public String acceptBooking(@ModelAttribute BookingRequest bookingRequest)
	{
		
		System.out.println("Mobile      :  "+bookingRequest.getMobile());
		System.out.println("Source      : "+bookingRequest.getSource());
		System.out.println("Destination :  "+bookingRequest.getDestination());
		System.out.println("Ride Type  :  "+bookingRequest.getRidetype());
		System.out.println("Amount     :  "+bookingRequest.getAmount());
		
		return "booking-confirmation";
	}
}
