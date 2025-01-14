package chapter10.com.hspedu.interface_;

public class InterfaceDetails {
    /*
     * （1）接口不能被实例化
     * （2）接口中所有的方法都是 public 方法，接口中的抽象方法，可以不用 abstract 修饰
     * （3）一个普通类要实现方法，就必须把接口中的所有方法都实现
     * （4）抽象类实现接口，可以不用实现接口中的方法
     * （5）一个类同时可以实现多个接口
     * （6）接口中的属性，只能是 public static final 修饰的
     * （7）接口中属性的访问形式：接口名.属性名
     * （8）一个接口不能继承其他的类，但是可以继承多个别的接口
     * （9）接口的修饰符，只能是是 public 和 默认，这点和类是一样的
     * */

    public static void main(String[] args) {
//        IA a = new IB() //接口不能被实例化

    }
}

interface IA {
    void say();

    public void hi();
}

class Cat implements IA {


    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Dog implements IA {
}