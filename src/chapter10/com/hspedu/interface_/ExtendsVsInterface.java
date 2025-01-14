package chapter10.com.hspedu.interface_;

public class ExtendsVsInterface {
}

//猴子类
class Monkey {
    private String name;

    public Monkey(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //爬树
    public void climbing() {
        System.out.println("Monkey " + name + " is climbing a tree.");
    }
}

//鱼 接口
interface Fish {
    void swimming();
}

//鸟 接口
interface Bird {
    void flying();
}


//超级猴子
class SuperMonkey extends Monkey implements Fish, Bird {
    public SuperMonkey(String name) {
        super(name);
    }

    @Override
    public void climbing() {
        System.out.println("Monkey " + getName() + " is climbing a tree.");
    }

    @Override
    public void swimming() {
        System.out.println("SuperMonkey " + getName() + " is swimming.");
    }

    @Override
    public void flying() {
        System.out.println("SuperMonkey " + getName() + " is flying.");
    }
}
/*
 * 小结：
 * （1）当子类继承了父类，就自动拥有父类的功能
 * （2）如果子类需要扩展功能，可以通过实现接口的方式来扩展
 * （3）可以理解 实现接口 是 对 Java 单继承机制的一种补充
 * （4）继承的价值主要在于：解决代码的复用性和可维护性
 * （5）接口的价值主要在于：设计，设计好各种规范（方法），让其它类去实现这些方法。即更加的灵活..
 * （6）接口比继承更加灵活，继承是满足 is - a 的关系，而接口只需满足 like - a 的关系
 * （7）接口在一定程度上实现了代码解耦。即：接口规范性 + 动态绑定
 * */