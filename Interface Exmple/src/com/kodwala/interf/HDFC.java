package com.kodwala.interf;

public class HDFC implements IBanking {

	@Override
	public void netBanking() {
System.out.println("HDFC.netBanking()");
		
	}

	@Override
	public void upipay() {
		System.out.println("HDFC.upipay()");
		
	}

	@Override
	public void addpay() {
		System.out.println("HDFC.addpay()");
		
	}

	@Override
	public void modifypay() {
		System.out.println("HDFC.modifypay()");
		
	}

	@Override
	public void takfingerprint() {
		System.out.println("HDFC.takfingerprint()");
		
	}

	@Override
	public void doEKYC() {
		System.out.println("HDFC.doEKYC()");
		
	}

}
