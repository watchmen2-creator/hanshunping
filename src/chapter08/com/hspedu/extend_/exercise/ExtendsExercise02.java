package chapter08.com.hspedu.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}

class A1 {
    public A1() {
        System.out.println("A1");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("B1的无参构造器");
    }

    public B1(String name) {
        System.out.println(name + "B1的有参构造器");
    }
}

class C1 extends B1 {
    public C1() {
        this("hello");
        System.out.println("C1的无参构造器");
    }

    public C1(String name) {
        super("hahah");
        System.out.println("C1的有参构造器");
    }
}
