package chapter10.com.hspedu.interface_;

/*
 * 接口就是给出一些没有实现的方法，封装到一起，到某个类要使用的时候，在根据具体情况把这些方法写出来。
 * 语法：
 * //接口定义
 * interface 接口名称{
 *     属性
 *     方法(抽象方法、默认方法（jdk8.0后）、静态方法（jdk8.0后）)
 * }
 * //接口实现
 * class 实现类名称 implements 接口名称{
 *   自己的属性
 *   自己的方法
 *   必须实现的接口的抽象方法
 * }
 *
 * 小结：
 * （1）在jdk7.0之前，接口里的所有方法都没有方法体
 * （2）jdk8.0后接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现
 * 静态方法正常写就可以，默认方法需要写上 default 关键字
 * */
public class Interface01 {
    public static void main(String[] args) {
        //创建手机、照相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//手机接入电脑
        computer.work(camera);//相机接入电脑
    }
}
