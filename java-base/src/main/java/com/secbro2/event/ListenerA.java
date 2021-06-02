package com.secbro2.event;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class ListenerA implements Listener {

    @Override
    public void onClick(Event event) {
        System.out.println("触发事件，type:" + event.getType() + "，data:" + event.getData());
    }
}
