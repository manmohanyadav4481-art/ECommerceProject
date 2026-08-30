package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Payment;

import com.amazon.account.config.SpringConfigAnnotatiion;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnotatiion.class);
    
      Payment pay  = (Payment) context.getBean(Payment.class);
       
       pay.showPayment();
    }
}
