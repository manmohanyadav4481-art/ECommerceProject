package com.programe.oops.overloadin.inhirt;

class Employee {
	public void salary (double salary) {
		System.out.println("Man : "+salary);
	}
	public void salary (double salary,int  bouns ) {
		System.out.println("salary :"+salary);
		System.out.println("bouns: "+bouns);
	}
	public void salary (double salary, int bouns, int incentive) {
		System.out.println("salary :"+salary);
		System.out.println("bouns : "+bouns);
		System.out.println("incentive : "+incentive);
	}
}

public class Overloa {

	public static void main(String[] args) {
		Employee em = new Employee ();
		em.salary(1200.0);
		em.salary(12000, 12000);
		em.salary(12000.0, 12000, 2000);

	}

}
