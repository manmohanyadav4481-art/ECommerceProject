package com.kodwala.interf;

public class SBI implements IBanking {

	@Override
	public void netBanking() {
		System.out.println("SBI.netBanking()");
		
	}

	@Override
	public void upipay() {
		System.out.println("SBI.upipay()");
		
	}

	@Override
	public void addpay() {
		System.out.println("SBI.addpay()");
		
	}

	@Override
	public void modifypay() {
		System.out.println("SBI.modifypay()");
		
	}

	@Override
	public void takfingerprint() {
		System.out.println("SBI.takfingerprint()");
		
	}

	@Override
	public void doEKYC() {
		System.out.println("SBI.doEKYC()");
		
	}

}
