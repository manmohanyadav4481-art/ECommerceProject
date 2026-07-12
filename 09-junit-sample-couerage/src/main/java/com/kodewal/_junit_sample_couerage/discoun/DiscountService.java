package com.kodewal._junit_sample_couerage.discoun;

public class DiscountService {

    

	public static double calculateFinalAmount(double amount, CustomerType customerType) {

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