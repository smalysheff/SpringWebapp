package ru.smal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);


        context.close();
    }
}
