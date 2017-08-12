package com.github.alexgitstudy.project.robot.main;

import com.github.alexgitstudy.project.robot.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ModelT1000 model1= (ModelT1000) context.getBean("modelT1000");
////        t1000.action();
//        System.out.println(model1);
        ModelT1000 model2= (ModelT1000) context.getBean("model1");
//        t1000.action();
        System.out.println(model2);
    }
}
