package chapter08.com.hspedu.extend_;

/*
 * 讲解继承的本质
 * */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        /*
         * 按照就近原则查找关系来返回信息
         * （1）首先看子类中是否有该属性
         * （2）如果子类中有这个属性，并且可以访问，则返回信息
         * （3）如果子类没有这个属性，就向上找父类是否有该属性（如果父类中有这个属性，并且可以访问，则返回信息）
         * （4）如果父类中就按照（3）的规则继续找上级父类，直到Object基类
         * */
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobbt);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobbt = "旅游";

}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;
//    private int age = 39;
}

class Son extends Father {
    String name = "大头儿子";
}