package com.secbro2.event;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class EventTest {

    public static void main(String[] args) {
        Listener listener = new ListenerA();
        ListenerSupport listenerSupport = new ListenerSupport();
        listenerSupport.addListener(listener);
        listenerSupport.triggerEvent(new Event("dataA", "typeA"));
    }
}
