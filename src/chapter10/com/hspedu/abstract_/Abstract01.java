package chapter10.com.hspedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        /*
         * 当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类
         * */
    }
}

//当一个类中有抽象方法，那么这个类必须被声明为抽象类，否则无法实例化。
//抽象类不能实例化，只能作为父类被继承。
//抽象类中可以有构造方法，也可以有普通方法、抽象方法、静态方法。
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //动物都有吃的方法，但是不能确定动物吃什么,所以声明为抽象方法
    //抽象方法没有方法体，只有方法签名，由子类实现。
    public abstract void eat();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    //抽象方法在子类中必须重写
    @Override
    public void eat() {

    }
}