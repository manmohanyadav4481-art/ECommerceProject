package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRcontroller {

	@GetMapping("/pnrCheck")
	public String checkPNRStatus(@RequestParam("pnrNumber") String pnrNo)
	{
		System.out.println("PNRcontroller.checkPNRStatus()......Received PNR from user is "+pnrNo);
	
		return "pnr-status";
	}
}
