package com.khadri.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human human = context.getBean(Human.class);

        Heart heart = human.getHeart();
        System.out.println(heart.getRythmic());
    }
}