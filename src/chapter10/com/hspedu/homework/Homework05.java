package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.fun();
    }
}

//外部类：A
class A {
    private final String NAME = "张三";

    public void fun() {
        //局部内部类：B
        class B {
            private final String NAME = "韩顺平教育";

            public void show() {
                System.out.println("B的name：" + NAME);
                System.out.println("A的name：" + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }

    public void show() {
        System.out.println("name is " + NAME);
    }
}
