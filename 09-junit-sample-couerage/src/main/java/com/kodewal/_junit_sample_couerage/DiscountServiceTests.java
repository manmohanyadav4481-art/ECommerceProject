package com.kodewal._junit_sample_couerage;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerage.discoun.DiscountService;

public class DiscountServiceTests 
{

	static DiscountService  discountService;
	
	@BeforeAll
	public static void beforeall()
	{
		discountService = new DiscountService ();
	}
	
	@Test
	public void testCalculateFinalAmount ()
	{
		
	}
}
