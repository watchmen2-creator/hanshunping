package chapter10.com.hspedu.codeblock_;

public class CodeBlockDetails03 {
    public static void main(String[] args) {
        /*
         * 构造器的最前面其实隐含了 super方法 和调用普通代码块
         * 静态相关的代码块，属性初始化，在类加载时，就执行完毕
         *
         * */

        SS ss = new SS();
        /*
        * 感觉其实是先调用静态代码块，然后调用构造器，在构造器里面有默认的先调用super方法，父类构造器
        * 然后调用普通代码块
        * 然后继承的父子类，是先调用父类静态代码块，然后调用子类静态代码块，然后调用子类的构造器。
        * 子类构造器中，先调用super方法，然后去父类的构造器里面，先调用super方法，然后调用父类的普通代码块
        * 然后调用子类的普通代码块剧结束了
        *
        * */
    }
}

class S {
    // 静态代码块
    static {
        System.out.println("S static block");
    }

    //普通代码块
    {
        System.out.println("S normal block");
    }

    //构造器
    public S() {
        // 构造器的最前面其实隐含了 super方法 和调用普通代码块
        //super();//调用父类构造器（先调用完父类的静态代码块、属性；普通代码块、属性，以及构造器）
        //调用普通的代码块
        System.out.println("S()");
    }
}

class SS extends S {
    // 静态代码块
    static {
        System.out.println("SS static block");
    }

    //普通代码块
    {
        System.out.println("SS normal block");
    }

    //构造器
    public SS() {
        // 构造器的最前面其实隐含了 super方法 和调用普通代码块
        //super();//调用父类构造器（先调用完父类的静态代码块、属性；普通代码块、属性，以及构造器）
        //调用普通的代码块
        System.out.println("SS()");
    }

}