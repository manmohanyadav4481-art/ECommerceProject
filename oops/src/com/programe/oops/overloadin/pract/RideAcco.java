package com.programe.oops.overloadin.pract;

class Ride {
	void bookRide (String location) {
		System.out.println("Booking Ride Pickup : "+location);
	}
	void bookRide (String location , int passengers) {
		System.out.println("Ride Drop : "+location);
		System.out.println("Total Passengers : "+passengers);
		//System.out.println("Booking for : "+passengers+"people to : "+location);
	}
}

public class RideAcco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ride ride = new Ride ();
ride.bookRide("Mumbai");
ride.bookRide("Delhi [Mumbai To Delhi]", 12);
	}

}
