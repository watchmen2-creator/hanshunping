package chapter13.com.hspedu.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //1. jdk5 前的手动装箱和拆箱方式，装箱：基本类型 -> 包装类型，反之，拆箱
        int n1 = 100;
        Integer integer = new Integer(n1);//手动装箱
        int i = integer.intValue();//手动拆箱


        //2. jdk5 后（含 jdk5）的自动装箱和拆箱方式
        int n2 = 200;
        Integer integer2 = n2;//自动装箱，底层还是调用了 Integer.valueOf(n2)
        int i2 = integer2;//自动拆箱，底层还是调用了 intValue() 方法
    }
}
