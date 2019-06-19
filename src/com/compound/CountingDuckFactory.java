package com.compound;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MalardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new ReadHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
