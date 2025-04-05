package chapter12.com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();//捕获异常
            System.out.println("A");//因为捕获了一场，被跳过执行
        } catch (Exception e) {
            System.out.println("B");//第一句
        } finally {
            System.out.println("C");//finally块，无论是否有异常都会执行，第二句
        }
        System.out.println("D");//第三局
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }
}
