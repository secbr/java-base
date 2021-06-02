package com.secbro2.observer;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public interface Subject {

    /**
     * 注册定义
     */
    void registerObserver(Observer observer);

    /**
     * 发送通知
     */
    void notifyObservers(Object msg);

}
