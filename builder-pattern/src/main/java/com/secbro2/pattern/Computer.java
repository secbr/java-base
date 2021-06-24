package com.secbro2.pattern;

/**
 * 电脑设备
 *
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class Computer {

    /**
     * 笔记本电脑
     */
    private Laptop laptop;

    /**
     * 鼠标
     */
    private Mouse mouse;

    /**
     * 显示器
     */
    private Screen screen;

    /**
     * 键盘
     */
    private Keyboard keyboard;

    public void show() {
        System.out.println("笔记本配置：" + laptop.getName());
        System.out.println("鼠标配置：" + mouse.getName());
        System.out.println("显示器配置：" + screen.getName());
        System.out.println("键盘配置：" + keyboard.getName());
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
