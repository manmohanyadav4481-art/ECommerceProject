package com.kodewala.exception.handling.revision1;




public class Main2 {
  void pay ()
  {
	  String BankName ="sbi" ;
	  String name = "";
	  int balance = 500;
	  
	  try
	  {
		  System.out.println("Excution Start");
		  System.out.println("BankName"+BankName);
		  System.out.println(name.length());
		  System.out.println(name);
		  System.out.println("AccountBalance"+balance);
		  System.out.println("Excution End");
		  
	  }
	  catch(Exception e)
	  {
		  e.getStackTrace();
	  }
  }

}
