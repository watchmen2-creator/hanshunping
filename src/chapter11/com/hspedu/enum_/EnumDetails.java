package chapter11.com.hspedu.enum_;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class EnumDetails {
    /*
     * （1）使用 enum 关键字后，就不能再继承其他类了，因为 enum 会隐式继承 Enum 类。而 Java 是单继承机制
     * （2）枚举类和普通类一样，可以实现接口，如下形式
     * enum 类名 implements 接口名1, 接口名2, ... {
     *     // 成员变量
     *     // 构造方法
     *     // 方法
     * }
     * */
}

class A {
}

interface B {
}

//enum C extends A {}

class D implements B {
}