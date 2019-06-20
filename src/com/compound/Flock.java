package com.compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
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
