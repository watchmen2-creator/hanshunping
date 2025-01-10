package chapter10.com.hspedu.interface_;

public interface AInerface {
    //属性
    public int x = 10;
    public int y = 20;

    //抽象方法
    public void method1();//接口中的抽象方法可以省略abstract关键字

    //静态方法
    public static void method2() {
        System.out.println("Interface method2");
    }

    //默认方法
    public default void method3() {
        System.out.println("Interface method3");
    }
}
