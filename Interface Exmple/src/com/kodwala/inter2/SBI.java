package com.kodwala.inter2;

public class SBI implements IBanking {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTxn() {
	System.out.println("SBI.cancelTxn()");
		
	}
	
	@Override
	 public void printPassBook ()
	{
		System.out.println("IBanking.printPassBook()");
	}

}
