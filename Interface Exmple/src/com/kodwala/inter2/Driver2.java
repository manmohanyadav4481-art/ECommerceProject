package com.kodwala.inter2;

public class Driver2 {

	public static void main(String[] args) {

		AccouRvs acc = new IDFC ();
		acc.currentAcc();
		acc.passbook();
		acc.salaryAcc();
		acc.savingAcc();
		acc.upipayment();
		System.out.println("--------------------");
		AccouRvs ac = new SBIBank ();
        ac.currentAcc();
        ac.passbook();
        ac.salaryAcc();
        ac.savingAcc();
        ac.upipayment();
	}

}
