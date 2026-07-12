package com.programe.oops.inherita.overrid.practt;

public class RideDriver {
public static void main (String [] args) {
	RideService r = new Rapido ();
	
	Ride ri = r.bookRide("Bike");
	
	System.out.println(ri.status);


}
}


