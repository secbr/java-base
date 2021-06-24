package com.secbro2.pattern;

/**
 * @author sec
 * @version 1.0
 * @date 2021/6/23
 **/
public interface ComputerBuilder {

    /**
     * 构建笔记本电脑
     */
    void constructLaptop();

    /**
     * 构建鼠标
     */
    void constructMouse();

    /**
     * 构建屏幕
     */
    void constructScreen();

    /**
     * 构建键盘
     */
    void constructKeyboard();

    /**
     * 返回最终产品对象
     */
    Computer getResult();

}
