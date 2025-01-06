package chapter08.com.hspedu.homework;

public class Homework06 {
    public static void main(String[] args) {

    }
}

class Grand {
    String name = "AA";
    private int age = 100;

    public void g1() {
    }
}

class Father extends Grand {
    String id = "001";
    private double score;

    public void f1() {
        /*
         * super可以访问哪些成员（属性和方法）？
         * super：name、g1()
         * this可以访问哪些成员？
         * this：g1()、id、score、f1()、name
         * */
    }
}

class Son extends Father {
    String name = "BB";

    public void g1() {
    }

    private void show() {
        /*
         * super可以访问哪些成员（属性和方法）？
         * super：name、id、f1()、g1()、
         * this可以访问哪些成员？
         * this：name、g1()、f1()、show()、id
         * */

    }
}