package com.kodewala.exception.handling.day2;

public class Order {
	
	void doSomething () {
		String name = null;// assume : received from other class
		
		try {
			System.out.println(name.length());//this is risky code
			System.out.println("After Execute");
			int i = 10/0;
			String a[]= {};
			String str = a[5];
		} catch (Exception e) {// null pointer exception is child of exception class
			 name ="NA";
			e.printStackTrace();
		}
		/*catch (NullPointerException) {
			
		}
		catch(ArrayIndexOutBoundException) {
			
		}
		*/
		for(int i = 0; i<5; i++)
		{
			System.out.println("Order.doSomething()"+i);
		}
	}

}
