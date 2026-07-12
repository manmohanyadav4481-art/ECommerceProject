package com.kodewal._junit_sample_couerag3;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerag2.CostomerType;
import com.kodewal._junit_sample_couerag2.DiscountServics;




public class DiscountServicesTest 
{

static DiscountServics  discountService;
	
	@BeforeAll
	public static void beforeAll()
	{
		discountService = new  DiscountServics ();
	}
	
	@Test
	public void testCalculateFinalAmountRegular ()
	{
		double expected = 1800;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.REGULAR);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCalculateFinalAmountPrimium ()
	{
		double expected = 1600;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.PREMIUM);
		assertEquals(expected, actual);
		
	}
}
