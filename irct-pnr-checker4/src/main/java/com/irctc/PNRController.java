package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRController {

	public String checkPNRStatus (@RequestParam("pnrNumber") String pnrNo)
	{
		System.out.println("PNRController.checkPNRStatus().................recived pnr user is : "+pnrNo);
		return "pnr-status";
	}
}
