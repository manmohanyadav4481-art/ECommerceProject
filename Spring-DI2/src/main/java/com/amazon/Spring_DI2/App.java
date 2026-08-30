package com.amazon.Spring_DI2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.settar.config.SpringConfing;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfing.class);
    	
    	com.amazon.settar.emp.Employee e1 = (com.amazon.settar.emp.Employee) context.getBean("emp2");
    	
    	e1.printInfo();
    }
}
