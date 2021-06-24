package com.secbro2.pattern;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Computer construct() {
        builder.constructLaptop();
        builder.constructMouse();
        builder.constructScreen();
        builder.constructKeyboard();
        return builder.getResult();
    }
}
