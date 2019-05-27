package com.state;

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());


    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        System.out.println("randomWinner " + randomWinner);
    }

    @Override
    public void insertQuarter() {
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        System.out.println("You turn a crunk");
        gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispense() {

    }
}
