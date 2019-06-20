package com.compound;

public class MalardDuck implements Quackable {
    Observable observable;

    public MalardDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        nofifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void nofifyObservers() {
        observable.nofifyObservers();
    }
}
