package com.programe.oops.mult.inhirt.pract;

class Ride {
	void book () {
		System.out.println("Boook Ride");
	}
}
class Bike extends Ride {
	void book () {
		System.out.println("Bike Ride Book");
	}
}
class Cab extends Bike {
	void book () {
		System.out.println("Cab Ride Book");
	}
}
class Porter extends Cab {
	void book () {
		System.out.println("Porter Ride Book ");
	}
}


public class Rapidomulti {

	public static void main(String[] args) {
		Ride ride = new Porter ();
		ride.book();
		// TODO Auto-generated method stub

	}

}
