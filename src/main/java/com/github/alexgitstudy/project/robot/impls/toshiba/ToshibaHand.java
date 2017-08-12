package com.github.alexgitstudy.project.robot.impls.toshiba;

import com.github.alexgitstudy.project.robot.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class ToshibaHand implements Hand {

    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }

}
