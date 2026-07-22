package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.beans.User;

public class App 
{
    public static void main( String[] args )
    {
      
    	String configFile = "com/amazon/user/beans.xml";
    	
    	// creat IoC Container
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext(configFile);  
    
    	// Requset for bean 
    	
    User user =	(User) context.getBean("acc");
    
    // using the bean
    
    user.displayUserInfo();
    }
}
