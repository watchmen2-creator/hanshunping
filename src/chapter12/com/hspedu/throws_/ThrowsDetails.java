package chapter12.com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetails {
    public static void main(String[] args) {

    }

    public void f2() {
        /*
         * 对于编译异常，程序必须处理，比如： try-catch-finally块，或者throws语句。
         * 对于运行时异常，程序如果没有处理，则默认使用throws语句声明处理。
         * 子类重写父类方法是，对抛出的异常的规定：子类重写的方法，所抛出的异常类型要么和父类抛出的异常保持一致，要么为父类抛出的异常的类型的子类型
         * 在 throws 过程中，如果有方法 try-catch ，就相当于处理异常，就可以不用 throws
         * */
    }


    public static void f1() throws FileNotFoundException {
        ////这里大家思考问题 调用f3() 报错
        //        //老韩解读
        //        //1. 因为f3() 方法抛出的是一个编译异常
        //        //2. 即这时，就要f1() 必须处理这个编译异常
        //        //3. 在f1() 中，要么 try-catch-finally ,或者继续throws 这个编译异常
        f3();
    }

    public static void f3() throws FileNotFoundException { //编译异常
        FileInputStream fileInputStream = new java.io.FileInputStream("D:/test.txt");
    }

    public static void f4() {
        //1. 在f4()中调用方法f5() 是OK
        //2. 原因是f5() 抛出的是运行异常
        //3. 而java中，并不要求程序员显示处理,因为有默认处理机制
        f5();
    }

    public static void f5() throws ArithmeticException {//运行异常

    }
}

class Father { //父类
    public void method() throws RuntimeException {
    }
}

class Son extends Father {//子类

    //3. 子类重写父类的方法时，对抛出异常的规定:子类重写的方法，
    //   所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    //4. 在throws 过程中，如果有方法 try-catch , 就相当于处理异常，就可以不必throws
    @Override
    public void method() throws ArithmeticException {
    }
}