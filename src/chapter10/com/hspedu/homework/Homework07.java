package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework07 {
    public static void main(String[] args) {
        Car2 car = new Car2(25);
        car.getAir().flow();
        Car2 car2 = new Car2(-5);
        car2.getAir().flow();
        Car2 car3 = new Car2(60);
        car3.getAir().flow();
    }

}

//Car类，有属性温度

class Car2 {
    private double temperature;//温度属性

    //构造器


    public Car2(double temperature) {
        this.temperature = temperature;
    }

    //成员内部类：空调
    class Air {

        //吹风功能
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷风");
            } else if (temperature < 0) {
                System.out.println("吹暖风");
            }
        }
    }

    //方案返回Air对象
    public Air getAir() {
        return new Air();
    }
}