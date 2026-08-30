package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.di.constructor.address.Address;
import com.amazon.di.constructor.config.SpringConfig;
import com.amazon.di.constructor.emp.Employee;

public class App 
{
    public static void main( String[] args )
   {
    
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    Address address =	(Address) context.getBean("emp1");
    
    Employee employee =   (Employee) context.getBean("emp2");
    
    employee.print();
    
    address.displayInfo();
    
    }
}
