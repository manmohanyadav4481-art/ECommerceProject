package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.bean.Payment;
import com.amazon.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
       Payment payment =  (Payment) context.getBean("pay1"); // requesting payment bean
       Payment payment1 =  (Payment) context.getBean("pay1"); // requesting payment bean
   
       System.out.println(payment == payment1);  // true then same
    }
}
