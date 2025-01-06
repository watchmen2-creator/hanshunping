package chapter08.com.hspedu.poly_.details;

public class PolyDetails02 {
    public static void main(String[] args) {
        /*
         * 属性没有重写这一说
         * 属性的值直接看编译类型
         * */
        Base base = new Sub();
        System.out.println(base.count);//10
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}