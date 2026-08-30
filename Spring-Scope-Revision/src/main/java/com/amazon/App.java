package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.di.constructor.config.SpringConfing;
import com.amazon.di.constructor.emp.Employee;
import com.amazon.di.constructor.payment.Payment;

public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext	 context = new AnnotationConfigApplicationContext(SpringConfing.class);
    	
  //  Payment payment =	(Payment) context.getBean("pay");
    
Employee employee  =  (Employee) context.getBean("pay1");

employee.print();
context.close();
    }
}
