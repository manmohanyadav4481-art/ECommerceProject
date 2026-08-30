package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.Config.SpringConfigAnnotation;
import com.amazon.account.beans.Payment;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class); // if you doesnot load everything (); remove springanot...class
  
    
       Payment pay = (Payment)context.getBean(Payment.class);
       
       pay.showPayment();
    }
}
