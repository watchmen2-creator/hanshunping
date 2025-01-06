package chapter08.com.hspedu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);//20
        sub.display();//20
        Base base = sub;//向上转型
        System.out.println(base == sub);//base 和 sub 是指定同一个Sub类型对象的变量，应该是一样的,true
        System.out.println(base.count);//注意，属性不重写，base的对象类型虽然是Sub但是变量类型是Base，是10
        base.display();//20

    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }

}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}