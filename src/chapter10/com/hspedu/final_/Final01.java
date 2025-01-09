package chapter10.com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
        /*
         * final 意思：最后的、最终的
         * final 可以修饰类，修饰方法，修饰属性，修饰局部变量
         * 在某些情况下会用到 final 关键字，比如：
         * （1）当不希望类被继承时，可以用final修饰类
         * （2）当不希望父类的方法被子类重写时，可以用final修饰方法
         * （3）当不希望类的属性被修改时，可以用final修饰属性
         * （4）当不希望局部变量被修改时，可以用final修饰局部变量
         * */
        E e = new E();
//        e.num = 20; // 编译错误，不能修改final修饰的属性
        final int num = 10; // 局部变量
//        num = 20; // 编译错误，不能修改final修饰的局部变量
    }
}

final class A {

}

//class B extends A {
//
//}

class C {
    public final void method() {
        System.out.println("method()");
    }

    public final int num = 10;
}

class D extends C {
    //    public void method() {
//        System.out.println("D.method()");
//    }
    public void test() {

//        num = 20; // 编译错误，不能修改final修饰的属性
    }

}

class E {
    public final int num = 10;
}

