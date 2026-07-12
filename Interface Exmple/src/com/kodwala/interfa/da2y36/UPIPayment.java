package com.kodwala.interfa.da2y36;

public class UPIPayment implements IPayment, IRefund {// both interface / the method signature is identical/so only one impl.. enough

	@Override
	public void pay ()
	{
		System.out.println("UPIPayment.pay()");
	}

	

}

