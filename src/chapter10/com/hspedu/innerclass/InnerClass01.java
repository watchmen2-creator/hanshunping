package chapter10.com.hspedu.innerclass;

public class InnerClass01 {
    /*
     * 内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系。
     * 内部类是学习的难点，同时也是重点，后面看底层源码时，有大量的内部类
     *
     * 内部类有四种
     * 定义在外部类局部位置上（比如方法内）：
     * （1）局部内部类（有类名
     * （2）匿名内部类（没有类名，重点）
     * 定义在外部类的成员位置上：
     * （1）成员内部类（没用static修饰）
     * （2）静态内部类（使用static修饰）
     * */
}

class Outer {
    // 成员变量
    private int n1 = 100;

    // 成员方法
    public void m1() {
        System.out.println("Outer.m1()");
    }

    // 代码块
    {
        System.out.println("Outer.代码块");
    }

    // 内部类
    class Inner {

    }
}