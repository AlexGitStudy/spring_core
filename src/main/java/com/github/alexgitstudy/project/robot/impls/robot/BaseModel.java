package com.github.alexgitstudy.project.robot.impls.robot;

import com.github.alexgitstudy.project.robot.interfaces.Hand;
import com.github.alexgitstudy.project.robot.interfaces.Head;
import com.github.alexgitstudy.project.robot.interfaces.Leg;
import com.github.alexgitstudy.project.robot.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alex on 15.06.17.
 */
public class BaseModel implements Robot {

    @Autowired
    private Hand hand;

    @Autowired
    private Leg leg;

    @Autowired
    private Head head;

    public BaseModel(){
        System.out.println(this + " - ModelT500 constructor()");

    }

//    public BaseModel(Hand hand, Leg leg, Head head) {
//        this();
//        this.hand = hand;
//        this.leg = leg;
//        this.head = head;
//    }

    public Hand getHand() {
        return hand;
    }
//    @Required
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }
//    @Required
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }
//    @Required
    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public void action() {

    }

    @Override
    public void dance() {

    }
}
