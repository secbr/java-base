package com.secbro2.pattern;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class Client {

    public static void main(String[] args) {

        // 普通配置电脑的组装
        ComputerBuilder builder = new CommonComputerBuilder();
        Director director = new Director(builder);
        Computer product = director.construct();
        product.show();

        System.out.println("------------------");

        // 高级配置电脑的组装
        builder = new SupperComputerBuilder();
        director = new Director(builder);
        product = director.construct();
        product.show();

        // 可拓展其他配置的构建中实现

    }
}
