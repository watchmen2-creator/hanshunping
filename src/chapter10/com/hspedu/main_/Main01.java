package chapter10.com.hspedu.main_;

public class Main01 {
    /*
     * main方法是虚拟机调用
     * java虚拟机需要调用类的main方法，所以访问权限必须是public
     * java虚拟机在执行main方法时不必创建对象，所以该方法是static
     * 该方法中接收String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数
     * java 执行的程序 参数1 参数2 参数3...
     * 在main方法中，我们可以直接调用main方法所在类的静态方法、静态变量
     * 不能直接调用非静态方法、非静态变量
     * */

    // 静态变量
    private static String name = "hspedu";

    // 静态方法
    public static void hi() {
        System.out.println("Hi " + name);
    }

    // 非静态变量
    private int num = 10;

    // 非静态方法
    public void hello() {
        System.out.println("Hello " + num);
    }

    public static void main(String[] args) {
        //可以直接调用静态变量、静态方法
        System.out.println("Hello " + name);
        hi();
        //不能直接调用非静态变量、非静态方法
//        System.out.println("Hello " + num);
//        hello();
        Main01 obj = new Main01();
        obj.hello();
    }
}
