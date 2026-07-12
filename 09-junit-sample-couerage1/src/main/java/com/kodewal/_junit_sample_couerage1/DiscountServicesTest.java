package com.kodewal._junit_sample_couerage1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerage2.CostomerType;
import com.kodewal._junit_sample_couerage2.DiscountServices;



public class DiscountServicesTest 
{

static DiscountServices  discountService;
	
	@BeforeAll
	public static void beforeall()
	{
		discountService = new  DiscountServices ();
	}
	
	@Test
	public void testCalculateFinalAmount ()
	{
		double expected = 1800;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.REGULAR);
		assertEquals(expected, actual);
		
	}
}
