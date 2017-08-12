package com.github.alexgitstudy.project.robot.impls.toshiba;

import com.github.alexgitstudy.project.robot.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class ToshibaLeg implements Leg {

    public void go() {
        System.out.println("Go to Toshiba!");
    }

}
