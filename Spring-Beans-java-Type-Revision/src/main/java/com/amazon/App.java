package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.beans.Payment;
import com.amazon.account.config.SpringConfig;
import com.amazon.account.config.SpringConfingAnnotation;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfingAnnotation.class);
         
   // Account account = (Account) context.getBean("pay");
    
    Payment payment = (Payment) context.getBean(Payment.class);
    
   // account.display();
    payment.showPayment();
          
    }
}
