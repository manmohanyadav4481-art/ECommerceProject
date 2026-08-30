package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PNRController {

	
	@GetMapping("pnrCheck")
	public String checkPNRStatus ()
	{
		return "pnr-status";
	}
}
