package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRController {

	@GetMapping("pnrCheck")
	public String checkPNRStatus (@RequestParam("pnrNumber") String pnrNo)
	{
		System.out.println("PNRController.checkPNRStatus()...... recived pnr Number from User is : "+pnrNo);
		return "pnr-status";
	}
}
