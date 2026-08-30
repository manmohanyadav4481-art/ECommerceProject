package com.amazon.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/viewFrom")
	public String viewLoginPage ()  // Request
	{
		// service layer---> Repository layer
		System.out.println("LoginController.viewLoginPage():::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		return "login-form";  // Response --> login-form ---> viewResolver --->  /WEB - INF / Views / login - form. jsp
	}
	
	@GetMapping("/logout")      //("/viewFrom")
	public String logout ()
	{
		System.out.println("LoginController.logout()::::::::::::::::::::::::::::::::::::::::::");
		
		return "logout-page";
}

}