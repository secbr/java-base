package com.secbro2.pattern;

/**
 * 超级电脑设备配置
 *
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public class SupperComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void constructLaptop() {
        Laptop laptop = new Laptop("S", "Mac Boor Pro");
        computer.setLaptop(laptop);
    }

    @Override
    public void constructMouse() {
        Mouse mouse = new Mouse("A", "无线鼠标");
        computer.setMouse(mouse);
    }

    @Override
    public void constructScreen() {
        Screen screen = new Screen("S", "液晶曲面屏");
        computer.setScreen(screen);
    }

    @Override
    public void constructKeyboard() {
        Keyboard keyboard = new Keyboard("S", "机械键盘");
        computer.setKeyboard(keyboard);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
