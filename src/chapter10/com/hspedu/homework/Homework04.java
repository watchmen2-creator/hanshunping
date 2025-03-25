package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculator() {
            @Override    //实现ICalculator接口的work()方法
            public double work(double n1, double n2) {
                return n1 - n2;
            }
        }, 10, 20);

        cellphone.testWork(new ICalculator() {
            @Override    //实现ICalculator接口的work()方法
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 20);
    }
}

interface ICalculator {
    //work() 完成计算，没有具体要求，自己设计
    public double work(double a, double b);
}

class Cellphone {
    public void testWork(ICalculator calculator, double n1, double n2) {
        double result = calculator.work(n1, n2);
        System.out.println("Result is: " + result);
    }

    public void fun() {
        ICalculator calculator = new ICalculator() {     //匿名内部类实现ICalculator接口
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        };
    }
}