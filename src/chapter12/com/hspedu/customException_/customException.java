package chapter12.com.hspedu.customException_;

import java.util.Scanner;

public class customException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        //年龄范围需要在18~120之间，否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) { //如果年龄范围不在18~120之间
            throw new AgeException("年龄必须在18~120之间");
        }
        System.out.println("年龄：" + age);
    }
}


/*
* 一般情况下，我们自定义异常是继承 RuntimeException
* 即把自定义异常做成 运行时异常，好处是我们可以使用默认的处理机制
* */
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
