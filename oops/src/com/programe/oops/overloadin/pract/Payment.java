package com.programe.oops.overloadin.pract;

class Paymentt {
	void pay (int amount) {
		System.out.println("Cash Payment : "+amount);
	}

void pay (int amount, String method) {
	System.out.println(method+"Payment : "+amount);
}
}

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Paymentt py = new Paymentt ();
py.pay(5);
py.pay(12, "Gpay");
	}

}
