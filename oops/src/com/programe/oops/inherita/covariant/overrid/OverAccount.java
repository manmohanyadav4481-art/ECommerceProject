package com.programe.oops.inherita.covariant.overrid;

class PaymentSystem {
	GenericResponse doPayment (String accNo, int amount, String note) {
	System.out.println("PaymentSystem.doPayment()");
	return new GenericResponse ("Default Payment");
	}
}

class UPI extends PaymentSystem{
	@Override
	protected UPIResponse doPayment(String accNo, int amount, String note) {
	System.out.println("UPI.doPayment ()");
	return new UPIResponse("success", "200");
	}
}


class GenericResponse {
	String message;
	
	GenericResponse (String message){
		this.message = message;
	}
}
class UPIResponse extends GenericResponse {
	String code;
	
	UPIResponse(String massage, String code){
		super(massage);
		this.code = code;
	}
}

