package com.programe.oops.mult.inhirt.pract;

class Account {
	void details () {
		System.out.println("Basic Account");
	}
}
class Savings extends Account {
	void details () {
		System.out.println("Saving Account");
	}
}
class Current extends Savings {
	void details () {
		System.out.println("Current Account");
	}
}
class Premium extends Current {
	void details () {
		System.out.println("Premium Account");
	}
}

public class BankMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Savings ();
		acc.details();

	}

}
