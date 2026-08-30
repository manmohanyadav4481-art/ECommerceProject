package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.di.constructor.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        com.amazon.di.constructor.emp.Employee employee =	(com.amazon.di.constructor.emp.Employee) context.getBean("emp3");
        
        employee.printInfo();
        }
}
