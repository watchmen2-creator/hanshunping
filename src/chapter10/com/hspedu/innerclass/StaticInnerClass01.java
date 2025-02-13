package chapter10.com.hspedu.innerclass;

public class StaticInnerClass01 {
    /*
     * 静态内部类：
     * 静态内部类是定义在外部类的成员位置，有Static修饰
     * 1.可以直接访问外部类的所有静态成员，包含私有的，但是不能直接访问非静态成员
     * 2.可以太那几爱任意访问修饰符（public，protected，默认，private），因为它的地位就是一个成员
     * 3.作用域：同其他成员，为整个类体
     * 4.静态内部类---访问---->外部类（比如：静态属性） [访问方式：直接访问所有静态成员]
     * 5.外部类---访问---->静态内部类 [访问方式：创建对象再访问]
     * 6.外部其他类---访问--->成员内部类 [访问方式:1、直接使用相应语法创建成员内部类的对象；2、在外部类中编写一个方法，返回成员内部类的对象]
     * 7.如果外部类和内部类的成员（静态）重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的静态成员，则可以使用（外部类名.成员名）去访问
     * */
    public static void main(String[] args) {
        //1、直接使用相应语法创建成员内部类的对象
        Outer09.Inner09 obj1 = new Outer09.Inner09();
        obj1.show();
        //2、在外部类中编写一个方法，返回成员内部类的对象
        Outer09 outer09 = new Outer09();
        Outer09.Inner09 obj2 = outer09.getInner09();
        obj2.show();
    }
}


class Outer09 {
    private static int x = 10;
    private int y = 20;

    static class Inner09 {
        private static int x = 10;
        private int y = 20;

        public void show() {
            System.out.println("x = " + x + "Outer09.x = " + Outer09.x);
            //如果外部类和内部类的成员（静态）重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的静态成员，则可以使用（外部类名.成员名）去访问
//            System.out.println("y = " + y);//不能直接访问非静态成员
        }
    }

    public void show() {
        //外部类访问静态内部类：创建对象再访问
        Inner09 inner09 = new Inner09();
        inner09.show();
    }

    //方法，返回静态内部类的对象
    public Inner09 getInner09() {
        return new Inner09();
    }
}