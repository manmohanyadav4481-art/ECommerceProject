package com.javacode;

 class Pay {
	
	int amount;
	
	String item;
	
	public Pay (int _amount, String _item) {
		System.out.println("Call Payment (int _amount, String _item)...");
		
		this.amount = _amount;
		this.item = _item;
	
	
	}
	
}
	
	public class Payment {
		
		public static void main (String [] args) {
			// TODO Auto-generated method stub
			Pay p0 = new Pay (100, "Google pay");
			
			System.out.println(" p0 --> "+p0.amount);
			System.out.println(" p0 --> "+p0.item);
			
			
			Pay p1 = new Pay (800, "Phone pay");
			
			System.out.println(" p1 --> "+ p1.amount);
			System.out.println(" p1 --> "+ p1.item);
		}
	

	}

