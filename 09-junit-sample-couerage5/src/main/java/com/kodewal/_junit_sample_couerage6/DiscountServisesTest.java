package com.kodewal._junit_sample_couerage6;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerage5.CostomerType;
import com.kodewal._junit_sample_couerage5.DiscountServices;







public class DiscountServisesTest 
{

static DiscountServices  discountService;
	
	@BeforeAll
	public static void beforeAll()
	{
		discountService = new  DiscountServices ();
	}
	
	@Test
	public void testCalculateFinalAmountRegular ()
	{
		double expected = 1600;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.REGULER, true , true, 100);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCalculateFinalAmountPrimium ()
	{
		double expected = 1400;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.PREMIUM , true, true, 100);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCalculateFinalAmountPrimiumRPAbove1000 ()
	{
		double expected = 1400;
		double actual = discountService.calculateFinalAmount(2000, CostomerType.PREMIUM , true, true, 1200);
		assertEquals(expected, actual);
		
	}
}