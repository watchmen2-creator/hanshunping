package chapter08.com.hspedu.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();

    }
}

class A {
    A() {
        System.out.println("A");
    }

    A(String name) {
        System.out.println("A name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("B");
    }

    B(String name) {
        System.out.println("B name");
    }

}
