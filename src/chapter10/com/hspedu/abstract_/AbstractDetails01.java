package chapter10.com.hspedu.abstract_;

public class AbstractDetails01 {
    public static void main(String[] args) {
        /*
         * 用 abstract 关键字来修饰一个类时，这个类就叫抽象类，抽象类不能实例化，只能作为父类被继承
         * 访问修饰符 abstract 类名{}
         * 用 abstract 关键字修饰的方法叫抽象方法
         * 访问修饰符 abstract 返回值类型 方法名(参数列表) ;
         * 抽象方法没有方法体，只有方法签名
         * 抽象类的价值更多作用是在于设计，是设计者设计好之后，让子类继承并实现抽象类
         * 抽象类是比较爱问的知识点，在框架和设计模式使用较多
         *
         * 抽象类不能被实例化，只能作为父类被继承
         * 抽象类不一定要有抽象方法，可以有普通方法、构造方法、成员变量等
         * 一旦类中有抽象方法，那么这个类就需要被定义为抽象类
         * abstract 只能修饰类和方法，不能修饰变量和其他的东西
         * 抽象类中可以有任意成员（抽象类的本质还是类）比如：非抽象方法、构造器、静态属性等
         * 抽象方法不能有主体，即不能实现
         * 如果一个类继承自抽象类，那么子类必须实现父类的所有抽象方法，否则子类也必须定义为抽象类
         * 抽象方法不能使用 private 、 static 、 final 关键字修饰，因为这些关键字的作用和 abstract 关键字的作用相冲突
         * */

//        A a = new A(); // 抽象类不能实例化
    }
}

abstract class A {
    //抽象类中可以没有抽象方法，可以有普通方法
    public void method1() {
        System.out.println("A类中的普通方法");
    }
}

//B类继承抽象类A，自己也定义为抽象类
abstract class B extends A {
}