package chapter12.com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {


    }

    public void f1() throws java.io.FileNotFoundException, RuntimeException { // throws 关键字声明抛出异常，让方法的调用者来处理
        /*
         * 创建了一个文件流对象
         * 这里的异常是java.io.FileNotFoundException 编译异常
         * 因为文件不存在，所以会抛出FileNotFoundException
         * 可以使用 try-catch 捕获异常并处理
         * 也可以使用 throws 关键字声明抛出异常
         * throws 关键字后面的异常类型可以使方法中产生的异常类型，也可以是它的父类
         * throws 关键字后边也可以是异常列表，多个异常用逗号隔开
         * */

        FileInputStream fileInputStream = new java.io.FileInputStream("D:/test.txt");
    }
}
