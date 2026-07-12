package com.kodewal.revision;



public class Usermgmt {

public void getUserinfo (String user)
{
	if (Usertype.RATAIL.equals(user))
	{
		System.out.println("Usermgmt.getUserinfo()");
		System.out.println("manmohan"+Usertype.RATAIL);
	}
	
	else if(Usertype.RESELLER.equals(user))
	{
		System.out.println("Usermgmt.getUserinfo()"+Usertype.RESELLER);
	}
	
	else if(Usertype.MARKETVALUE.equals(user)) 
	{
		System.out.println("the task is clean"+Usertype.MARKETVALUE);
	}
	else {
		System.out.println("manmohan yadav ");
	}
}

}
