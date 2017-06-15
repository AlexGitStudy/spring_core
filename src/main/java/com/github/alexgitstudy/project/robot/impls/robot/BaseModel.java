package com.github.alexgitstudy.project.robot.impls.robot;

import com.github.alexgitstudy.project.robot.interfaces.Hand;
import com.github.alexgitstudy.project.robot.interfaces.Head;
import com.github.alexgitstudy.project.robot.interfaces.Leg;
import com.github.alexgitstudy.project.robot.interfaces.Robot;

/**
 * Created by alex on 15.06.17.
 */
public class BaseModel implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public BaseModel(){
        System.out.println(this + " - ModelT500 constructor()");

    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

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
