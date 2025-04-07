package chapter12.com.hspedu.homework;

public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");//第一句
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();//铺货异常
            System.out.println("A");//有异常会跳过执行
        } catch (Exception e) {
            System.out.println("C");//第二句
        }
        System.out.println("D");//第三句
    }

}
