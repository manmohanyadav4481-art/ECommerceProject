package com.programe.oops.inherita.overrid.practt;

public class ZomatoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FoodService f  = new Zomatoa ();
Order res = f.placeOrder("Pizza");
System.out.println(res.status);
	}

}
