package com.constructor;

/*class Student{
	Student(){
		System.out.println("Student object created");
	}
}

public class ConsExmply {
public static void main(String[] args) {
Student s1 = new Student();	

	}

}

class Car {
	Car (){
		System.out.println("Car constructor");
	}
}

public class ConsExmply{
	public static void main(String []args) {
		Car c1 = new Car ();
	}
}

class Car {
	String name;
	
	Car(String n){
		name = n;
		System.out.println("Car Name : "+name);
	}
}
public class ConsExmply {
	public static void main (String [] args) {
		Car c1 = new Car("Bmw");
	}
}


class Mobile {
	Mobile (){
		System.out.println("No argument constructor");
	}
	
	Mobile (String name){
		System.out.println("Mobile Name : "+name);
	}
	
}
public class ConsExmply {
	public static void main (String []args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile ("Sumsumg");
	}
}


class Demo {
	static {
		System.out.println("Sib executed");
		
	}
}

public class ConsExmply{
	public static void main(String [] args) {
		System.out.println("Main method");
	}
	
}


class Demo {
	{
		System.out.println("IIb executed");
	}
	
	Demo (){
		System.out.println("Constructor excutred");
	}
}

public class ConsExmply{
	public static void main (String [] args) {
		Demo d1 = new Demo ();
		Demo d2 = new Demo ();
	}
}

class Test {
	static {
		System.out.println("1 . sib");
	}
	
	{
		System.out.println("2 . iib");
	}
	
	Test(){
		System.out.println("3 . Constructor");
	}
}

public class ConsExmply{
	public static void main (String [] args) {
		System.out.println("4 . main Start");
		Test t1 = new Test ();
		Test t2 = new Test ();
	}
}

class Sample{
	static int a = 10;
	int b = 20;
	
	static {
		System.out.println("Sib a = "+a);
	}
	
	{
		System.out.println("IIb b = "+b);
	}
	
	Sample (){
		System.out.println("Constructor");
	}
}

public class ConsExmply{
	public static void main (String [] args) {
		Sample s1 = new Sample ();
	}
}

class ConsExmply{
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
		
	}
	ConsExmply (){
		System.out.print("Constructor");
	}
	
	public static void main(String [] args) {
		System.out.println("Main Method");
	}
}

class ConsExmply{
	static {
		System.out.println("Sib");
	}
	{
		System.out.println("IIB");
	}
	ConsExmply (){
		System.out.println("constructor");
	}
	public static void main (String [] args) {
		ConsExmply c1 = new ConsExmply ();
	}
}

class Text {
	static {
		System.out.println("Sib 1");
	}
	
	static {
		System.out.println("sib 2");
	}
	{
		System.out.println("sib 1");
	}
	{
		System.out.println("sib 2");
	}
	Text (){
		System.out.println("constructor");
	}
}
public class ConsExmply{
	public static void main (String [] args) {
		Text t1 = new Text();
	}
}

class A {
	A(){
		System.out.println("A Constructor");
	}
}
class B extends A {
	{
		System.out.println("B IIB");
	}
	
	B(){
		System.out.print("B constructor");
	}
}
public class ConsExmply {
	public static void main (String [] args) {
		B b1 = new B ();
	}
}

class A {
	static{
		System.out.println("A SIB");
	}
	{
		System.out.println("A IIB");
	}
	
	A(){
		System.out.println("Constructor");
	}
	
}
class B extends A {
	static {
		System.out.println("B SIB");
	}
	{
		System.out.println("B IIB");
	}
	B (){
		System.out.println("Constructor");
	}
}

public class ConsExmply {
	public static void main(String [] args) {
		B b = new B ();
	}
}

class Student {
	Student (){
		this(101);
		System.out.println("Default Constructor");
	}
	Student (int id){
		System.out.println("paramenter Constructor : "+id);
	}
}
public class ConsExmply{
	public static void main (String [] args) {
		Student s1 = new Student ();
	}
}

class Parent {
	Parent (){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent {
	Child(){
		super();
		System.out.println("child Constructor");
	}
}

public class ConsExmply{
	public static void main(String [] args) {
		Child c = new Child ();
	}
}

class ConsExmply {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	ConsExmply(){
		System.out.println("3");
	}
	public static void main (String [] args){
		ConsExmply x1 = new ConsExmply ();
		ConsExmply x2 = new ConsExmply ();
		System.out.println("4");
	}
}

class Demo {
	Demo (){
		System.out.println("Constructor");
	}
	void Demo () {
		System.out.print("Method");
	}
}
public class ConsExmply{
	public static void main (String [] args) {
		Demo d1 = new Demo ();
		d1.Demo();
	}
}

class Parent {
	static {
		System.out.println("Parent SIB");
	}
	{
		System.out.println("Parent IIB");
	}
	
	Parent (){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent {
	static {
		System.out.println("Child SIB");
	}
	{
		System.out.println("Child IIB");
	}
	Child (){
		System.out.println("Child Constructor");
	}
}

public class ConsExmply{
	public static void main(String [] args) {
		System.out.println ("Main Start");
		Child c1 = new Child ();
		Child c2 = new Child ();
		
	}
}

class ConsExmply {
	static {
		System.out.println("Hello");
	}
	public static void main (String [] args) {
		System.out.println("java");
	}
}

class A{
	A(){
		System.out.println("A");
	}
}
class B extends A {
	B(){
		System.out.println("B");
	}
}
public class ConsExmply {
	public static void main (String [] args) {
		new B ();
	}
}

class A{
	void A(){
		System.out.println("Method");
	}
	A(){
		System.out.println("Constructor");
	}
}
public class ConsExmply{
	public static void main(String [] args) {
		A obj = new A ();
		obj.A();
	}
}

class A {
	A (){
		this(10);
		System.out.println("X");
		
	}
	A (int A){
		System.out.println("y");
	}
}
public class ConsExmply{
	public static void main(String [] args) {
		new A();
	}
}
*/
class ConsExmply {
	{
		System.out.println("IIB");
	}
	ConsExmply(){
		System.out.println("Constructor");
	}
	public static void main (String [] args) {
		new ConsExmply ();
	}
}