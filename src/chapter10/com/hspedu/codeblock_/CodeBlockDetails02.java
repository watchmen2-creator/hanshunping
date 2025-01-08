package chapter10.com.hspedu.codeblock_;

public class CodeBlockDetails02 {
    public static void main(String[] args) {
        /*
         * 创建一个对象时，在一个类中的调用顺序是：
         * （1）先调用静态代码块和静态属性初始化（注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块，则按照代码顺序执行）
         * （2）然后调用普通代码快和普通属性的初始化（注意：普通代码快和普通属性初始化调用的优先级一样，如果有多个普通代码块，则按照代码顺序执行）
         * （3）最后调用构造方法
         * */
        XXX x = new XXX();
    }
}

class XXX {
    // 静态属性
    private static int a = 10;//静态属性顺序在静态方法上，静态方法中就可以调用静态属性，否则就会报错，因为没有初始化，找不到属性
    private static int b = getB();//可以调用静态方法，但是不能调用普通方法的返回值 因为还没有初始化

    //    private static int b = getA();//静态属性先初始化，如果取普通方法的返回值，也会报错
    // 静态代码块
    static {
        System.out.println("(1)先调用静态代码块、静态属性初始化");
        System.out.println("a=" + a);
    }

    //普通属性
    private int c = 30;

    //普通代码块
    {
        System.out.println("(2)然后调用普通代码块、普通属性初始化");
    }

    // 构造方法
    public XXX() {
        System.out.println("(3)最后调用构造方法");
    }

    //普通方法
    public int getA() {
        return 55;
    }

    //静态方法
    public static int getB() {
        return 66;
    }

}