package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(100);
        System.out.println(car1);//9.0 red
        System.out.println(car2);    //100.0 red
    }
}

class Car {
    double price;
    static String color = "white";

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    public String toString() {
        return this.price + "\t" + this.color;
    }

}