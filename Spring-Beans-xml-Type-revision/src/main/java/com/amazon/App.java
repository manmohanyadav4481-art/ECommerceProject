package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.bean.User1;


public class App 
{
    public static void main( String[] args )
    {
    	String configfile ="com/amazon/NewBeanFile.xml";
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext(configfile);
    
   User1 userName = (User1) context.getBean("acc");
    
    userName.setUsername("man");
    userName.setType("city");
    userName.setLocation("BLR");
    
    userName.display();
    }
}
