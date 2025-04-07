package chapter12.com.hspedu.exception_;

public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();
        B b1 = (B) b;
        C c = (C) b;
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

