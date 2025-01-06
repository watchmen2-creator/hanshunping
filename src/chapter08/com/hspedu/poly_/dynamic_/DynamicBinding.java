package chapter08.com.hspedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.sum());//40 -> 30
        /*
        * B类中注销掉sum、sum1这两个方法后的语句执行过程
        * a.sum()，首先a这个变量，变量类型是A，a指向的对象的对象类型是B，也就是编译类型是A，运行类型是B
        * 调用sum方法，首先看B类中有没有sum方法，没有，然后根据继承机制去A里面找，A里面有sum方法
        * getI()+10；此处又用到了方法getI，根据动态绑定机制，调用方法的话，方法和运行类型绑定，还是需要先去B类里面找getI方法，B类中有getI方法
        * return i;i是属性，属性没有动态绑定机制，有就近原则，先去找B类里面的i，B类里面有i，是20，就返回给getI方法了
        * getI()+10；getI方法返回的是20,20 + 10 = 30 ，就返回sum方法
        * a.sum()，就返回30
        * */
        System.out.println(a.sum1());//30 -> 20
        /*
         * B类中注销掉sum、sum1这两个方法后的语句执行过程
         * a.sum1()，首先a这个变量，变量类型是A，a指向的对象的对象类型是B，也就是编译类型是A，运行类型是B
         * 调用sum1方法，首先看B类中有没有sum1方法，没有，然后根据继承机制去A里面找，A里面有sum1方法
         * return i + 10;i是属性，没有动态绑定机制，有就近原则，就去A类里面的i，A类里面有i，是10,10 + 10 = 20 ，就返回给sum1方法了
         * a.sum1()，就返回20
         * */
    }
}

class A {
    public int i = 10;

    /*
     *Java的动态绑定机制
     * （1）当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
     * （2）当调用对象属性时，没有动态绑定机制，有
     * 就近原则，哪里声明哪里调用
     * */
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {//子类getI()
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}