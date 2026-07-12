package com.kodewal._junit_sample_couerag2;



public class DiscountServics {

    

	public static double calculateFinalAmount(double amount, CostomerType customerType) {

        double discount = 0;

        switch (customerType) 
        {

            case REGULAR :
                discount = 10;
                break;

            case PREMIUM:
                discount = 20;
                System.out.println("DiscountServices.calculateFinalAmount()");
                System.out.println("DiscountServices.calculateFinalAmount()");
                System.out.println("DiscountServices.calculateFinalAmount()");
                System.out.println("DiscountServices.calculateFinalAmount()");
                System.out.println("DiscountServices.calculateFinalAmount()");
                break ;
        }

        return amount - (amount * discount / 100);
    }
}