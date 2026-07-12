package com.kodewal._junit_sample_couerage5;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerage4.CostomerType;
import com.kodewal._junit_sample_couerage4.DiscountServics;






public class DiscountServiscsTest 
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
		double expected = 1600;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.REGULAR, true , true, 100);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCalculateFinalAmountPrimium ()
	{
		double expected = 1400;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.PREMIUM , true, true, 100);
		assertEquals(expected, actual);
		
	}
}