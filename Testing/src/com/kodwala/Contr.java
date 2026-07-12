package com.kodwala;

 /*class Student {

	String name ;
	int age;
	
	Student (String name, int age){
		//name = n;
		//age = a;
		this.name = name;
		this.age = age;
		//System.out.println("Default Canstructor Called");
	}
   void display () {
	   System.out.println("Name = "+name);
	   System.out.println("Aage = "+age);
	   
   }
   }
public class Contr{
	public static void main(String[] args) {
		Student s1 = new Student("Rahul",20);
		s1.display();
		
		// TODO Auto-generated method stub

	}

}


class BankAccount {
	String accountHolder;
	int accountNumber;
	double balance;
	
	BankAccount (String accountHolder, int accountNumber, double balance) 
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Holder = "+accountHolder);
		System.out.println("Account Number =  "+accountNumber);
		System.out.println("Balance = "+balance);
		System.out.println("-------------------");
		
	}
	}
	public class Contr {
		public static void main (String [] args) {
			BankAccount b1 = new BankAccount("Rahul", 123,2342.0);
			BankAccount b2 = new BankAccount("Amit", 1131,33.0);
			
			b1.display();
			b2.display ();
		}
	}


class Employee{
String name;
int id;
double salary;


Employee(){
	name = "Unknown";
	id = 0;
	salary = 0.0;
	
}

Employee(String name, int id, ){
	this.name = name;
	this.id = id;
	salary = 0.0;
}

Employee(String name, int id, double salary,String mobileNumber){
this.name = name;
this.id = id;
this.salary = salary;
this.mobile = mobileNumber;

}

void display() {
	System.out.println("Name = "+name);
	System.out.println("ID = "+id);
	System.out.println("Salary = "+salary);
	System.out.println("-----------------");
}
}

public class Contr{
	public static void main (String [] args) {
		Employee e1 = new Employee ();
		Employee e2 = new Employee ("Man", 101);
		Employee e3 = new Employee ("Mohan", 102,3455);
		
		e1.display();
		e2.display();
		e3.display();
		
}
}


class OrderMgmt {
    OrderMgmt() {
        System.out.println("Parent Constructor");
    }
}

class Child extends OrderMgmt {
    Child() {
        super();
        System.out.println("Child Constructor");
        System.out.println("Child2 Canstructor");
 
}



class Delivery {
	String customerName;
	String itemName;
	String delDate;
	String status;
	
	// default Constructor
	Delivery(){
		System.out.println("Default Constructor Called");
		
	}
	
	
	//parameter constructor
	
	Delivery (String customerName, String itemName, String delDate, String Status){
		this.customerName = customerName;
		this.itemName = itemName;
		this.delDate = delDate;
		this.status = status;
	}
	
	//Method to display details
	void display () {
		System.out.println("Customer Name : "+customerName);
		System.out.println("Item Name : "+itemName);
		System.out.println("Delivery Date : "+delDate);
		System.out.println("Status : "+status);
		System.out.println("----------------");
		
	}
}
	public class Contr{
		public static void main (String [] args) {
			//Default constructor object
			Delivery d1 = new Delivery();
			
			System.out.println("Default Value");
			d1.display();
			
			//3 delivery objects 3 customers
			
			Delivery d2 = new Delivery ("Rahul", "Leptop", "02-03-2015", "Delivery");
			Delivery d3 = new Delivery ("Priya", "Mobile", "03-05-2015", "Pending");
			Delivery d4 = new Delivery ("Mohan", "Headphone", "08-06-15", "Shipped");
			
			System.out.println("Default value");
			
			d2.display();
			d3.display();
			d4.display();
			
		}
	
}


class Student {
	String name;
	int age;
	
	//default constructor
	
	Student (String n, int a){
		name = n;
		age = a;
		
	//	parameter constructor
	}
		void display() {
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
		}
}
		//Student object method
		public class Contr{
			public static void main(String [] args) {
			Student d1 = new Student("Rahul", 22);
			d1.display();
		}
	}



class Delivery {
	String customerName;
	String itemName;
	String delDate;
	String status;
	
	//Default constructor
	
	Delivery (){
		System.out.println("Default constuctor");
		
	}
// parameter constructor
	
	Delivery  (String customerName, String itemName, String delName, String status){
		this.customerName = customerName;
		this.itemName = itemName;
		this.delDate  = delDate;
		this.status = status;
	}
	
		//method of object
	
	void display() {
		System.out.println("Customer Name : "+customerName);
		System.out.println("Item Name : "+itemName);
		System.out.println("Delivery Date : "+delDate);
		System.out.println("Status : "+status);
		System.out.println("-----------------");
		
	}
}

public class Contr{
	public static void main (String [] args) {
		Delivery d1 = new Delivery ();
		System.out.println("Default Contructor");
		d1.display();
		
		//Three object Delivery method
		
		Delivery d2 = new Delivery ();
		Delivery d3 = new Delivery ();
		Delivery d4 = new Delivery ();
		
		d2.display();
		d3.display();
		d4.display();
	}
}


class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class Contr{
	public static void main(String [] args) {
		Student s1 = new Student ("Amit", 30);
		s1.display();
	}
}


class BankAccount{
	String accountHolder;
	int accountNumber;
	double balance;
	
	//Default Constructor
	BankAccount(String accountHolder, int accountNumber, double balance){
		// parameter of object
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		// method of object
	}
		void display () {
			System.out.println("accountHolder : "+accountHolder);
			System.out.println("accountNumber : "+accountNumber);
			System.out.println("Balance : "+balance);
            System.out.println("-------------------");			
		}
		
}
	public class Contr {
	public static void main (String [] args) {
		BankAccount d1 = new BankAccount ("Man", 102,700.0);
		BankAccount d2 = new BankAccount("Mohan", 102, 7000.0);
		
		d1.display();
		d2.display();
			
		}
		
	}


class Employee{
	String name;
	int id;
	double salary;
	
	//Default constructor
	
	Employee (){
		name = "Unknown";
		id = 104;
		salary = 0.0;
		
	}
		// parameter of object 
		
		Employee (String name, int id){
			this.name = name;
			this.id = id;
			salary = 0.0;
			
	 	}
		
		Employee (String name, int id, double salary){
			this.name = name;
			this.id = id;
			this.salary = salary
					
		}
		
		void display () {
			System.out.println("Name = "+name);
			System.out.println("Id Num = "+id);
			System.out.println("Salary = "+salary);
			System.out.println("----------------");
			
		}
}


public class Contr{
	public static void main (String [] args) {
		Employee d1 = new Employee ();
		Employee d2 = new Employee ("Amit", 101);
		Employee d3 = new Employee ("Rahul", 102);
		
		d1.display();
		d2.display();
		d3.display();
			
	}

}

	
class Person {
	String name;
	
	Person (String name){
		this.name = name;
		System.out.println("Person Constructor called");
		
	}

	}
class Student extends Person{
	int rollNo;
	
	Student(String name, int rollNo){
		super(name);
		this.rollNo = rollNo;
		System.out.println("Student Constructor called");
	}
	
	void display () {
		System.out.println("Name = "+name);
		System.out.println("RollNumber = "+rollNo);
		
	}
}

public class Contr{
	public static void main(String [] args) {
		Student s1 = new Student ("Rahul", 225);
		s1.display();
	
	}
}


class Book{
	String title;
	int price;
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
		
	}
	
	Book(Book b) {
		this.title = b.title;
		this.price = b.price;
		
	}
	
	void display () {
		System.out.println("Title =" +title);
		System.out.println("Price = " +price);
	}
}

public class Contr{
	public static void main(String [] args) {
		Book b1 = new Book ("Java basic", 234);
		Book b2 = new Book (" Spring Boot", 2343);
		
		b1.display();
		b2.display();
	}
}



class Demo{
	private Demo() {
		System.out.println("Private Constructor called");
	}
	
static	void show() {
		Demo d = new Demo();
		
	}
}

public class Contr{
	public static void main (String [] args) {
		Demo.show();
		
	}
}


class Text {
	Text(){
		System.out.println("Constructor");
	}

	
		void Text(){
		System.out.println("method");
	}

}
public class Contr{
	public static void main(String []args) {
		Text t = new Text ();
		t.Text();
	}
}

class Pen{
	String color;
	int price;
	
	Pen (String c , int p){
		color = c;
		price = p;
	}
	 
     void display (){
	   System.out.println(color +""+price);
	}
}
public class Contr{
	public static void main (String [] args) {
		Pen l1 = new Pen ("blue",10);
		Pen l2 = new Pen ("yellow", 3);
		
		l1.display();
		l2.display();
		
	}
}

class Book{
	String name;
	int pages;
	
	Book (String name, int pages){
		this.name = name;
		this.pages = pages;
}
	void display () {
		System.out.println(name +""+pages);
	}
}
public class Contr{
	public static void main(String [] args) {
		Book b1 = new Book ("java",300);
		b1.display();
	}
}

class Fan {
	Fan(){
		System.out.println("Fan Created");
	}
	
	Fan (String brand){
		System.out.println("Brand : "+brand);
	}
	
	Fan(String brand , int speed){
		System.out.println(brand +""+speed);
	}
}
public class Contr{
	public static void main(String[]args) {
		new Fan();
		new Fan("Usha");
		new Fan("Crompton : ",6);
	}
}
*/
class Phone{
	String model;
	int price;
	
	Phone (String model, int price){
		this.model = model;
		this.price = price;
	}
	
	Phone (Phone p){
		this.model = p.model;
		this.price = p.price;
	}
	void display() {
		System.out.println(model +""+price);
	}
}
public class Contr{
	public static void main (String []args) {
		Phone m1 = new Phone ("Sumsung : ",9000);
		Phone m2 = new Phone (m1);
		m1.display();
		m2.display();
	}
}