package com.Arraylist.Revision;

import java.util.ArrayList;

public class DrivarUBI {

	public static void main(String[] args) {
		
		// create ArrayList and Store defaultelement
		
		ArrayList<UBIUser>defaultList = new ArrayList<UBIUser>();
		
		UBIUser user = new UBIUser ("Manmohan", "UBI1232", "MUMBai", 12000);

		UBIUser user1 = new UBIUser ("Rohan", "IDFC121", "DElHi", 100);
		
		UBIUser user2 = new UBIUser ("man", "SBl121", "DelhiEAst",16000);
		
		UBIUser user4 = new UBIUser ("Raj", "HDFC121", "LKN", 500);
		
		defaultList.add(user);
		defaultList.add(user1);
		defaultList.add(user2);
		defaultList.add(user4);
		
			
		for(int i=0; i<defaultList.size(); i++)	{
			UBIUser us = defaultList.get(i);
			if(us.getBalance()<1000){
				System.out.println("Send Email to user "+us.getName()+" balance is not maintaine");
			}
			
		}
		
	}

}
