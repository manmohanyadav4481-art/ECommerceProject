package com.amazon.user.Spring_Beans_xml_Type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.Bean.User;

public class App {

    public static void main(String[] args) {

    	ApplicationContext context =
    		    new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("acc", User.class);

        user.displayUserInfo();
    }
}