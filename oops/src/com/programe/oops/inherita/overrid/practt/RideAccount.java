package com.programe.oops.inherita.overrid.practt;

class RideService {
	Ride bookRide (String ride) {
		System.out.println("RideService.bookRide()");
		return new Ride ("BookRide.Ride");
	}
}
class Rapido extends RideService {
	@Override
	BikeRide bookRide (String ride) {
		System.out.println("Rapido.bookRide");
		return new BikeRide ("Comfirm. Bike");
	}
}
class Ride {
	String status;
	Ride(String status){
		this.status = status;
	}
}
class BikeRide extends Ride {
	String type;
	BikeRide(String type){
		super(type);
		this.type = type;
	}
}