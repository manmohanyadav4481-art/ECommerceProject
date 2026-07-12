package com.amazon.user1;

public class UserMgmt1 {

    public void getUserInfo(String userType1) {

        if (UserType1.RETAIL.equals(userType1)) {

            System.out.println("======= Retail Customer =======");
            System.out.println("Customer ID       : CUST1001");
            System.out.println("Customer Name     : Rahul Sharma");
            System.out.println("Email             : rahul@gmail.com");
            System.out.println("User Type         : " + UserType1.RETAIL);

        } else if (UserType1.RESELLER.equals(userType1)) {

            System.out.println("======= Reseller Details =======");
            System.out.println("Reseller ID       : RE55001");
            System.out.println("Company Name      : ABC Electronics");
            System.out.println("User Type         : " + UserType1.RESELLER);

        } else if(UserType1.MARKETPLACE.equals(userType1))
        {
        	System.out.println("THIS IS MARKTPLACE");
        }
        
        else {
            System.out.println("Invalid user type.");
        }
    }
}