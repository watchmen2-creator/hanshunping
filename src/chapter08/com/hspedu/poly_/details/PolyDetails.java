package chapter08.com.hspedu.poly_.details;

public class PolyDetails {
    public static void main(String[] args) {
        /*
         * 向上转型：父类的引用指向了子类的对象
         * 语法：父类类型引用名 = new 子类类型() ；
         * 特点：编译类型看左边，运行类型看右边
         * 可以调用父类方法中的所有成员（遵守访问权限）
         * 不能调用子类中的特有成员
         * 最终运行效果看子类的具体实现
         * */
        Animal animal = new Cat();
        Object obj = new Cat();
        animal.eat();
        animal.sleep();
        animal.run();
        animal.show();
        /*
         * 向下转型
         * 语法：子类类型 引用名 = （子类类型）父类引用；
         * 只能强制转化父类的引用，不能强制转化父类的对象
         * 要求父类的引用必须指向的是当前目标类型的对象
         * 可以调用子类类型中所以得成员
         * */
        Cat cat = (Cat) animal;
//        Dog dog = (Dog) animal;//编译不报错，但是会运行报错
        System.out.println("------------------");
        cat.eat();
        cat.run();
        cat.show();
        cat.sleep();
        cat.catchMouse();
    }
}


class Animal {
    String name = "Animal";
    int age = 10;

    public void sleep() {
        System.out.println("Animal sleeping...");
    }

    public void run() {
        System.out.println("Animal runing...");
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void show() {
        System.out.println("Animal name is " + name + " and age is " + age);
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eating...");
    }

    public void catchMouse() {
        System.out.println("Cat catching mouse...");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eating...");
    }
}