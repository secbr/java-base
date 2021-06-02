package com.secbro2.event;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/2
 **/
public class Event {
    private String data;
    private String type;

    Event(String data, String type) {
        this.data = data;
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
