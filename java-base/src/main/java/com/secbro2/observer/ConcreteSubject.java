package com.secbro2.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class ConcreteSubject implements Subject {

    /**
     * 观察者集合
     */
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Object msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
