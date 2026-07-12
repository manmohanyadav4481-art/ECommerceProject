package com.programe.oops.Encap.day23;

public class Driver1 {

	public static void main(String[] args) {
			Acoount a = new Acoount ();
			//a.balance = 10000;
			//a.deposit(-1200);
			a.deposit(1200);
			
			System.out.println(a.getbalance());
	}
}
