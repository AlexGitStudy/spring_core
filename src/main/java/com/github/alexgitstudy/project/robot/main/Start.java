package com.github.alexgitstudy.project.robot.main;

import com.github.alexgitstudy.project.robot.impls.robot.ModelT1000;
import com.github.alexgitstudy.project.robot.interfaces.Robot;
import com.github.alexgitstudy.project.robot.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object object = context.getBean("t1000");
        if (object instanceof ModelT1000) {
            ModelT1000 t1000 = (ModelT1000) object;
            System.out.println(t1000);
        }
// 3 способ Injection в объект, он нужен, когда нам нужно создать бесконечное колличество объектов используя CGLIB
        RobotConveyor t1000Conveyor= (RobotConveyor) context.getBean("t1000Conveyor");

        Robot terminator1=t1000Conveyor.createRobot();
        Robot terminator2=t1000Conveyor.createRobot();
        Robot terminator3=t1000Conveyor.createRobot();

        System.out.println("terminator1 + " + terminator1);
        System.out.println("terminator2 + " + terminator2);
        System.out.println("terminator3 + " + terminator3);

    }
}
