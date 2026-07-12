package com.kodwala.interfa.da3y36;



public class Main2 {
	
	String student ;
	
	Main2(String _student){
		this.student = _student;
	}
	
	@Override
	public Main2 clone()throws CloneNotSupportedException {
		return (Main2) super.clone(); // object class clone
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Main2 p = new Main2 ("ManMohan ");
		/*
		Main1 p1 = p.clone();
				System.out.println("p "+p.student); System.out.print("p1 "+p1.student);
			
				*/
		
				if (p instanceof Cloneable) {  // True if person's object is type of Cloneble---> person class should implement clonable interface 
					System.out.println("p is type of clonable");
				}
				else
				{
					System.out.println("p is not type of cloneble. you can not clone the object of main class");
				}

	}

}
