package com.kodwala.inter2;

interface AccouRvs {
	default void savingAcc () {
		
	}
	void withdraw ();
	void passbook ();
	void upipayment ();
	
	default void currentAcc () 
	{
	  
	}
	default void salaryAcc () {
		
	}

}
class SBIBank implements AccouRvs {

	@Override
	public void savingAcc() {
		System.out.println("SBIBank.savingAcc()");
		
	}

	@Override
	public void withdraw() {
	System.out.println("SBIBank.withdraw()");
		
	}

	@Override
	public void passbook() {
		System.out.println("SBIBank.passbook()");
		
	}

	@Override
	public void upipayment() {
		System.out.println("SBIBank.upipayment()");
		
	}
	
}
class IDFC implements AccouRvs {

	@Override
	public void currentAcc () {
		System.out.println("IDFC.currentAcc()");
	}
	
	
	
	@Override
	public void withdraw() {
		System.out.println("IDFC.withdraw()");
		
	}

	@Override
	public void passbook() {
		System.out.println("IDFC.passbook()");
		
	}

	@Override
	public void upipayment() {
		System.out.println("IDFC.upipayment()");
		
	}
	
}