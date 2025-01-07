package chapter10.com.hspedu.static_;

public class StaticMethodDetails {
    public static void main(String[] args) {
        /*
         * （1）类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区：类方法中无 this 的参数
         * 普通方法中隐含着 this 的参数
         * （2）类方法可以通过类名调用，也可以通过对象名调用
         * （3）普通方法和对象有关，需要通过对象名的调用，比如对象名.方法名（参数），不能通过类名调用
         * （4）类方法中不允许使用和对象有关的关键字，比如 this 和 super 。普通方法可以
         * （5）类方法（静态方法）中 只能访问 静态变量 或 静态方法
         * （6）普通方法既可以访问 普通变量、方法，也可以访问静态变量、方法
         * 小结：静态方法，只能访问静态的成员，非静态的方法，可以访问静态成员和非静态成员（必须遵守访问权限）
         * */
        D.fun();
//        D.say();
    }
}

class D {
    private int n1;
    private static int n2;

    public void say() {
        System.out.println(this.n2);

    }

    public static void fun() {
//        System.out.println(n1);
        System.out.println(n2);
//        System.out.println(this.n2);
        hi();
//        say();
    }

    public static void hi() {
    }
}