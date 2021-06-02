package com.secbro2.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class ListenerSupport {

    private List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void triggerEvent(Event event) {
        for (Listener listener : listeners) {
            listener.onClick(event);
        }
    }
}
