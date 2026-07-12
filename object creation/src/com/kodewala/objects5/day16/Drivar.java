package com.kodewala.objects5.day16;

class Order extends Object
{
	int amount;
	Order ()
	{
		this(200);
		//System.out.println("this argument amount : "+amount);
	}
	Order (int _amount)
	{
		this.amount= _amount;
		
	}
}

public class Drivar {

	public static void main(String[] args) {
		
		Order or = new Order ();
		//or.hashCode();
		

	}

}
