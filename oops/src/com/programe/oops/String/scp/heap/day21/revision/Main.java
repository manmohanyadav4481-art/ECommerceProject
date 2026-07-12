package com.programe.oops.String.scp.heap.day21.revision;

public class Main {
	
	public static void main (String[]args) {
		
		String employeeId = "user123";
		String salary = null;
		
		Main bulder = new Main ();
		
		bulder.generateInvoice(employeeId, salary);
		
	}


public void generateInvoice (String emplId, String salary)
{
	StringBuilder bul = new StringBuilder ("String FistName , String LastName , Employee Where ");

   if (emplId != null) 
   {
	 bul.append("EmployeeId: "+emplId);   
   }
   else if(salary !=null)
   {
	   bul.append("Salary : "+salary);
   }
   else 
   {
	   bul.append("String FirstName , String LastName , EmployeeId where");
   }
   bul.append(".");
   
   System.out.println("Final Query is : "+bul);
}
}