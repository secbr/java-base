package com.secbro2.observer;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update(Object msg) {
        System.out.println("ConcreteObserver 接收到主题的消息: " + msg);
    }
}
