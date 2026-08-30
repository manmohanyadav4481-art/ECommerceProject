package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.config.SpringConfig;
import com.amazon.payamet.Payment;
import com.amazon.payamet.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
     PaymentService payment =  context.getBean(PaymentService.class);
       
     payment.doPayment();
       
    }
}
