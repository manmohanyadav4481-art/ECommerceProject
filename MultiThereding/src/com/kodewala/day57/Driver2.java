package com.kodewala.day57;

public class Driver2 {

	public static void main(String[] args) {
		
		System.out.println("Who is executing this code ?  : "+Thread.currentThread().getName());

        System.out.println("Driver0.main()");
        
        Driver2 d = new Driver2();
        d.someMethod();
		
	}
	
	public void someMethod()
	{
		System.out.println(" who is exeuting someMethod() ? : "+Thread.currentThread().getName());
		System.out.println("Driver2.someMethod()");
	}

}
