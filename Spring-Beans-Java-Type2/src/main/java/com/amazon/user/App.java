package com.amazon.user;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    
       Account account = (Account) context.getBean("createAccount2");  // if you write wrong beans  afhglafd
       
       account.displayInfo();
    }
}
