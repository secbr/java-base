package com.secbro2.pattern;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class Laptop {

    private String type;

    private String name;

    public Laptop(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
