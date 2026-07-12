package com.kodewala.oops.polymorphism.day29.pract;

public class Driver1 {

	public static void main(String[] args) {
		
		BookingProcessor bo = new BookingProcessor ();
		
		Ride ride = new Ride ();
		
          bo.processc(ride);
          
          Rapido rip = new Rapido ();
          
          bo.processc(rip);
          
          Ola ol = new Ola ();
          
          bo.processc(ol);
          
          UberCab ub = new UberCab ();
          bo.processc(ub);

	}

}
