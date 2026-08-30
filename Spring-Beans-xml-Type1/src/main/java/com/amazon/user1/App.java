package com.amazon.user1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user1.Beans.User;

public class App 
{
    public static void main( String[] args )
    {
    	String configFile ="com/amazon/user1/beans1.xml";
        
    	// create Ioc container
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
    
    	// Requst for bean
    	
    User user =	(User) context.getBean("acc");
    
    
    // Using the bean
    
    user.setUserName("manmohan");
    user.setType("Local");
    user.setLocation("BLR");
    
    user.displayInfo();
    
    }
}


//  google search for Spring file = Spring xml file scheama beans
//  google search for dependancey = Spring context maven dependancy
