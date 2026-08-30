package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRController {

    @GetMapping("/pnrCheck")
    public String checkPNRStatus(
            @RequestParam("pnrNumber") String pnrNO) {

        System.out.println("Received PNR Number: " + pnrNO);

        return "pnr-status";
    }
}