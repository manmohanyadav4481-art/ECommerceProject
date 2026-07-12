package com.kodwala.interfa.da3y36;


public class Main1 implements Cloneable {
	
	String student ;
	
	Main1(String _student){
		this.student = _student;
	}
	
	@Override
	public Main1 clone()throws CloneNotSupportedException {
		return (Main1) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		Main1 p = new Main1 ("ManMohan ");
		
		Main1 p1 = p.clone();
				System.out.println("p "+p.student); 
				System.out.print("p1 "+p1.student);
				
				if (p instanceof Cloneable) {
					System.out.println("p is type of clonable");
				}
				else
				{
					System.out.println("p is not type of cloneble. you can not clone the object of main class");
				}

	}

}
