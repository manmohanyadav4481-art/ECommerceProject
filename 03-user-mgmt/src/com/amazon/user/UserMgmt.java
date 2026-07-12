package com.amazon.user;

public class UserMgmt {

    public void getUserInfo(String userType) {

        if (UserType.RETAIL.equals(userType)) {

            System.out.println("======= Retail Customer =======");
            System.out.println("Customer ID       : CUST1001");
            System.out.println("Customer Name     : Rahul Sharma");
            System.out.println("Email             : rahul@gmail.com");
            System.out.println("User Type         : " + UserType.RETAIL);
            System.out.println("Prime Member      : Yes");
            System.out.println("Wallet Balance    : 2,350");
            System.out.println("Reward Points     : 1,250");
            System.out.println("Total Orders      : 18");
            System.out.println("Account Status    : Active");
            System.out.println("==============================");

        } else if (UserType.RESELLER.equals(userType)) {

            System.out.println("======= Reseller Details =======");
            System.out.println("Reseller ID       : RE55001");
            System.out.println("Company Name      : ABC Electronics");
            System.out.println("User Type         : " + UserType.RESELLER);
            System.out.println("==============================");
        
        } else {
            System.out.println("Invalid user type.");
        }
    }
}