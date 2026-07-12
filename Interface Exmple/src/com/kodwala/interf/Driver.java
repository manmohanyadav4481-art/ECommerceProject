package com.kodwala.interf;

public class Driver {
public static void main (String [] args) {
	IBanking ib = new SBI ();
	ib.addpay();
	ib.modifypay();
	ib.netBanking();
	ib.takfingerprint();
	ib.doEKYC();
	
	IBanking i = new HDFC ();
	i.addpay();
	i.modifypay();
	i.netBanking();
	i.takfingerprint();
	i.doEKYC();
}
}
