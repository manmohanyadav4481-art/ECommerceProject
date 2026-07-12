package com.programe.oops.inherit.pract;


/*
 class School  {

	//functionalities
	public void studentmgmt( ) {
		System.out.println("Student Name is Ram");
	}
	
}
class Student extends School {//Driver is child
	
	public void Studentmgmt() {
		System.out.println("Hi Ram");
	}
	
}
 public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s = new Student ();
    s.Studentmgmt();
	}

}

class PaymentSystem{
	
	public void pay()
	{
		System.out.println("Hello");
	}
}

class Phonepay extends PaymentSystem{
	public void pay ()
	{
		System.out.println("Hi");
	}
}

class Gpay extends PaymentSystem {
	public void Pay ()
	{
		System.out.println("Ram");
	}
}

public class Driver {
	public static void main (String[]args) {
		PaymentSystem pa = new PaymentSystem ();
		Phonepay ph = new Phonepay ();
		Gpay gp = new Gpay ();
		ph.pay();
		gp.Pay();
		pa.pay();
	}
}

class Employee {
	public void bank () {
		System.out.println("Hello");
	}
}

class Manger extends Employee {
	public void bank () {
		System.out.println("Hello Manger");
	}
}

class Clerk extends Employee{
	public void bank () {
		System.out.println("Hello clerk");
	}
}

public class Driver {
	public static void main (String []args) {
		Employee e = new Employee ();
		Manger m = new Manger ();
		Clerk c = new Clerk ();
		c.bank();
		m.bank();
		e.bank();
	}
}

class EngineeringDepar {
	public void department() {
		System.out.println("Department of Engineering B .Tech");
	}
}
class B_Tech extends EngineeringDepar
{
	public void department () {
		System.out.println("Branch Offer Electrical and Electronic Eng.. , Computer Scince and Eng.. ,   ");
		
	}
}

class M_Tech extends EngineeringDepar
{
	public void department () {
		System.out.println("Branch Offer Only Computer scince and Engineering ");
	}
}

class Mba extends EngineeringDepar
{
	public void department () {
		System.out.println("Branch Offer Information Technology , Banking Finance");
		}
}

public class Driver {
	public static void main (String [] args) {
   EngineeringDepar En = new EngineeringDepar ();
   B_Tech b = new B_Tech ();
   M_Tech m = new M_Tech ();
   Mba a = new Mba ();
   b.department();
   m.department();
   a.department();
	}
}

class Board {
	public void EduBoard ()
	{
        System.out.println("Central Government Offer : CBSE BOARD OF EDUCATION");
        System.out.println("-----Head Office-----");
		System.out.println("Address : Preeti Vihar Delhi 110092");
		System.out.println("State Government Offer : STATE BOARD OF EDUCATION");
		System.out.println("------Head Office-----");
		System.out.println("Address : Capital of State");
	}
}
class Cbse extends Board {
	public void EduBoard ()
	{
		System.out.println("Central Government of india");
	}
}
class StateBoard extends Board {
	public void EduBoard ()
	{
		System.out.println("Government of State");
	}
}
class Driver {
	public static void main (String[]args) {
		Board b = new Board ();
		Cbse c = new Cbse ();
		StateBoard s = new StateBoard ();
		b.EduBoard();
		c.EduBoard();
		s.EduBoard();
	}
}

//public class
class Rapido {
	String bike;
	String city;
	double distance;
	double price;
	//constructor
	Rapido (String bike, String city , double distance){
		this.bike = bike;
		this.city = city;
		this.distance = distance;
	}
	//method to culculate price (₹10 per km)
	void culculateprice () {
		price = distance *10;
	}
	//display details
	void display () {
		System.out.println("   🛵RAPIDO🛵        ");
		System.out.println("★Summary Fair Details★    ");
		System.out.println("Bike : "+bike);
		System.out.println("City : "+city);
		System.out.println("Distance : "+distance +"km");
		System.out.println(" Total Price : ₹"+price);
	}
	
}
//main method class
public class Driver {
	public static void main (String [] args) {
		Rapido r = new Rapido ("Bike","Mumbai",15);
		r.culculateprice();
		r.display();
		
	}
}

class OlaCab {
	String car;
	String city;
	double distance;
	double price;
	//constructor
	OlaCab (String car, String city , double distance){
		this.car = car;
		this.city = city;
		this.distance = distance;
	}
	//method calculate the price (₹10km) 
	void culculatePrice () {
		price = distance*10;
	}
	
	//display details
	void display () {
		System.out.println("   🚖    OLACAB  🚖   ");
		System.out.println("Travels Details");
		System.out.println("Vehicle Name : "+car);
		System.out.println("Place of Journey : "+city);
		System.out.println("distance "+distance+"km");
		System.out.println("Total Amount "+price);
	}
}

public class Driver {
	public static void main (String[]args) {
		OlaCab o = new OlaCab ("Cab","Bangalore",15);
		o.culculatePrice();
		o.display();
	}
}

class Rapido {
	String bike;
	String city;
	double distance;
	double price;
	
	Rapido (String bike, String city, double distance){
		this.bike = bike;
		this.city = city;
		this.distance = distance;
	}
	void culculate () {
		price = distance*10;
		if (price<30) {
			price=30;
		}
	}
		void display () {
			System.out.println("      🚖RAPIDO🚖       ");
			System.out.println("                        ");
			System.out.println("Bike : "+bike);
	        System.out.println("City Name : "+city);
	        System.out.println("Distance : "+distance +"Km");
	        System.out.println("Total amount "+price);
		}
	}
public class Driver{
	public static void main(String[]args) {
		Rapido r1 = new Rapido ("Bike", "Mumbai",20);//2km->20 but min = 30
		Rapido r2 = new Rapido ("Cab", "Bangalore",10);//2->50
				r1.culculate();
		        r1.display();
		        
		        System.out.println("🚖                   🚖");
		        System.out.println("                        ");
		        
		       r2.culculate();
		       r2.display();
	}
}

class Rapido {
	String bike;
	String city;
	double distance;
	double price;
	boolean isNight;
	
	Rapido (String bike, String city, double distance, boolean isNight){
		this.bike = bike;
		this.city = city;
		this.distance =distance;
		this.isNight = isNight;
	}
	void culculate () {
		double ratePerKm =10;
		
		if(isNight) {
			ratePerKm +=5;
		}
		price = distance *ratePerKm;
		
		if(price<30) {
			price =30;
		}
	}
	
	void display () {
		System.out.println("🚖RAPIDO🚖");
		System.out.println("Vehicle : "+bike);
		System.out.println("City Name : "+city);
		System.out.println("Travel Distance : "+distance +"km");
		System.out.println("Night Charge :"+(isNight ? "Yes" : "No"));
		System.out.println("Total Amount : "+price);
	}
}
public class Driver {
	public static void main (String[]args) {
		Rapido r1 = new Rapido ("Bike", "Mumbai", 10,fae);
		Rapido r2 = new Rapido ("Cab", "Lucknow", 10, te);
		r1.culculate();
		r1.display();
		
	System.out.println("                        ");
	r2.culculate();
	r2.display();
	}
}
*/

import java.util.ArrayList;

class Rapid {
	String bike2;
	String city2;
	double distance2;
	double price;
	boolean isNight2;
	
	Rapid (String bike2, String city2, double distance2, boolean isNight2){
	this.bike2 = bike2;
	this.city2 = city2;
	this.distance2 = distance2;
	this.isNight2 = isNight2;
	}
	//public Rapid(String bike2, String city2, int distance2, boolean isNight2) {
		// TODO Auto-generated constructor stub
	
	void calculatePrice () {
		double ratePerKm = 10;
		
		if(isNight2) {
			ratePerKm= 5;
		}
		price = distance2*ratePerKm;
		
		if(price<30) {
			price =30;
		}
	}
	
	void display () {
		System.out.println("Vehicle Name : "+bike2);
		System.out.println("City Name : "+city2);
		System.out.println("Travel Distance : "+distance2+"Km");
		System.out.println("Night Charge : "+(isNight2 ? "Yes" : "No"));
		System.out.println("Final Amount : "+price);
	}
}
class Cartt {
	ArrayList<Rapid>rides=new ArrayList<>();
	
	void addRide(Rapid r) {
		r.calculatePrice();
		rides.add(r);
	}
	
	void showRides() {
		for (Rapid r : rides) {
			r.display();
		}
	}
	void showTotal() {
		double total = 0;
		
		for(Rapid r : rides) {
			total = r.price;
		}
		System.out.println("-------------------");
		System.out.println("Total Bill : ₹"+total);
	}
}

public class Driver {
	public static void main (String[]args) {
		Cartt c = new Cartt ();
		
		Rapid r1 = new Rapid ("Bike", "Varansi", 12, false);
		Rapid r2 = new Rapid ("Cab", "Bangaloe", 8, true);
		Rapid r3 = new Rapid ("Car", "Bangaloe", 9, true);
		
		c.addRide(r1);
		c.addRide(r2);
		c.addRide(r3);
		
		c.showRides();
		c.showRides();
	}
}
