package com.kodewal._junit_sample_couerage3;



public class DiscountServics {

    

	public static double calculateFinalAmount(double amount, CostomerType customerType, boolean isFestivalSale, boolean isFirstOrder, int loyaltyPoints  ) {

		if (amount <=0)
		{
			throw new IllegalArgumentException("Invalid order amount");
		}
		
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
        
        // fistival offer 
        if(isFestivalSale)
        {
        	discount += 5;
        }
        
        //first order offer
         if (isFirstOrder)
         {
        	 discount +=5;
         }
         
         // loyailty bonus
         if (loyaltyPoints >=1000)
         {
        	 discount +=3;
         }
        // Maximum discount allowed
         if (discount > 30)
         {
        	 discount = 30;
         }
        return amount - (amount * discount / 100);
    }
}