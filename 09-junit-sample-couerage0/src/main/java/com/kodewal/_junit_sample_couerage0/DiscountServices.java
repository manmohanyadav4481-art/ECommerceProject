package com.kodewal._junit_sample_couerage0;



public class DiscountServices {

    

	public static double calculateFinalAmount(double amount, CostomerType customerType) {

        double discount = 0;

        switch (customerType) 
        {

            case REGULAR :
                discount = 10;
                break;

            case PREMIUM:
                discount = 20;
                break ;
        }

        return amount - (amount * discount / 100);
    }
}