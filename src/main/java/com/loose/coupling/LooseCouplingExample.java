package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationDataProvider.xml");
        UserManager userDatabaseManager = (UserManager) context.getBean("userDatabaseManager");
        UserManager webDatabaseManager = (UserManager) context.getBean("webDatabaseManager");
        UserManager newDatabaseManager = (UserManager) context.getBean("newDatabaseManager");

        System.out.println(userDatabaseManager.getUserInfo());
        System.out.println(webDatabaseManager.getUserInfo());
        System.out.println(newDatabaseManager.getUserInfo());
    }
}
