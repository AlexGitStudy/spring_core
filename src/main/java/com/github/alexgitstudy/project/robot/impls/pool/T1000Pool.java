package com.github.alexgitstudy.project.robot.impls.pool;

import com.github.alexgitstudy.project.robot.interfaces.Robot;
import com.github.alexgitstudy.project.robot.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotCollection;

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action(){
        for (Robot r: robotCollection
             ) {
            r.action();

        }

    }
}
