package com.programe.oops.inherit;



class StudentMgmt{  //parent of Student class
	
	String rollnum = "Rm12E";
	
	public void doMarkGive(){
		System.out.println("StudentMagmt.doMarkGive()..52 marks ");
	}
}
class Studentname extends StudentMgmt{ 
	//Student class is child of StudentMgmt	
	
		public void resul () {
            System.out.println(rollnum);
			doMarkGive();
		}
	}
	public class AccoStudent {
		public static void main (String [] args) {
			Studentname s = new Studentname ();
					s.resul();
		}
}





