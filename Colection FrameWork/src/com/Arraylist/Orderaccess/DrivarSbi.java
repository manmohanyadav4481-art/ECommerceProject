package com.Arraylist.Orderaccess;

import java.util.ArrayList;

public class DrivarSbi {

	public static void main(String[] args) {
		
		ArrayList<SBIUser>defaultList = new ArrayList<SBIUser>();
		
		SBIUser u1 = new SBIUser ("Rahul" , "btm" ,"sbi", 700 );
		
		SBIUser u2 = new SBIUser ("Rajram" , "btm" ,"sbi", 1200 );
		
		SBIUser u3 = new SBIUser ("Rohan" , "btm" ,"sbi", 10000 );
		SBIUser u4 = new SBIUser ("Raj" , "btm" ,"sbi", 500);
		SBIUser u5 = new SBIUser ("Raju" , "btm" ,"sbi", 5000 );
		
		SBIUser u6 = new SBIUser ("Ram" , "btm" ,"sbi", 500 );

		
		defaultList.add(u1);
		defaultList.add(u2);
		defaultList.add(u3);
		defaultList.add(u4);
		defaultList.add(u5);
		defaultList.add(u6);
		
	//==========================================================================
			
			for (int i = 0; i<defaultList.size(); i++)
			{
				SBIUser user =  defaultList.get(i);
				if(user.getBalance()<1000)
				{
					System.out.println("Sending email to User"+user.getName()+"as his/her Balance is not maintained");
				}
			}
	}

}
