package com.collection.framework.set.day48.revision;

import java.util.HashSet;
import java.util.Set;

class Account
{
	int amount;
	
	Account (int amount)
	{
		this.amount=amount;
	}
}

public class Drivar4 {

	public static void main(String[] args) {
		
		Account a = new Account (1200);
		Account a1 = new Account (1300);
		Account a2 = new Account (1400);
		Account a3 = new Account (1500);
		Account a4 = new Account (1400);
		Account a5 = new Account (1600);
		
		
		Set<Account>set = new HashSet<Account>(64);
		
		set.add(a);
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		System.out.println(set.size());
		
		set.add(a4); //add tree
		set.add(a5);
		System.out.println(set.size());
		
		set.remove(a3);
		
		System.out.println(set.size());
		

	}

}
