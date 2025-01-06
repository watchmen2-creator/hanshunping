package chapter08.com.hspedu.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态性
        A a = new A();
        System.out.println(a.sum(1, 2));
        System.out.println(a.sum(1, 2, 3));

        //方法重写体现多态性
        B b = new B();
        a.say();
        b.say();

    }
}

class B {
    public void say() {
        System.out.println("B say");
    }
}

class A extends B {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void say() {
        System.out.println("A say");
    }
}
