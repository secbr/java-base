package com.secbro2.pattern;

/**
 * 普通电脑设备配置
 *
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class CommonComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void constructLaptop() {
        Laptop laptop = new Laptop("A","华为笔记本");
        computer.setLaptop(laptop);
    }

    @Override
    public void constructMouse() {
        Mouse mouse = new Mouse("A","无线鼠标");
        computer.setMouse(mouse);
    }

    @Override
    public void constructScreen() {
        Screen screen = new Screen("A","液晶显示器");
        computer.setScreen(screen);
    }

    @Override
    public void constructKeyboard() {
        Keyboard keyboard = new Keyboard("A","普通键盘");
        computer.setKeyboard(keyboard);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
