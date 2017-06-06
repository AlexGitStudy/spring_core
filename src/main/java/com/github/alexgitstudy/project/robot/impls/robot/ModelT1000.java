package com.github.alexgitstudy.project.robot.impls.robot;

import com.github.alexgitstudy.project.robot.interfaces.Hand;
import com.github.alexgitstudy.project.robot.interfaces.Head;
import com.github.alexgitstudy.project.robot.interfaces.Leg;
import com.github.alexgitstudy.project.robot.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}
