package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowireType.xml");

        Car car = (Car) context.getBean("myCar");
        car.displaySpecification();
    }
}
