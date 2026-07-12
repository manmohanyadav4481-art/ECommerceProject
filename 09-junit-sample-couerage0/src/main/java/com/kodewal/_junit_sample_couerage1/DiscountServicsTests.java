package com.kodewal._junit_sample_couerage1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample_couerage0.CostomerType;
import com.kodewal._junit_sample_couerage0.DiscountServices;

public class DiscountServicsTests 
{

static DiscountServices discountServices;
	
	@BeforeAll
	public static void beforeAll()
	{
		discountServices = new  DiscountServices ();
	}
	
	@Test
	public void testCalculateFinalAmount ()
	{
		double expected = 1800;
		double actual = discountServices.calculateFinalAmount(2000, CostomerType.REGULAR);
		assertEquals(expected, actual);
		
	}
}

