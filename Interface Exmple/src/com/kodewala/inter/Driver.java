package com.kodewala.inter;

import com.kodwala.inter2.SBI;

import com.kodewala.inter.*;
import com.kodwala.inter2.SBI;

public class Driver {

	public static void main(String[] args) {
		
		SBI 	 obj = new SBI ();
		obj.pay();
		obj.settle();
     	obj.cancelTxn();
		obj.printPassBook();

	}

}
