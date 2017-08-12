package com.github.alexgitstudy.project.robot.impls.toshiba;

import com.github.alexgitstudy.project.robot.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class ToshibaHead implements Head {

    public void calc() {
        System.out.println("Thinking about Toshiba...");
    }

}
