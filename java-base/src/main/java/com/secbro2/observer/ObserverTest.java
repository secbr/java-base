package com.secbro2.observer;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerObserver(observer);
        subject.notifyObservers("来自Subject的消息");

    }
}
