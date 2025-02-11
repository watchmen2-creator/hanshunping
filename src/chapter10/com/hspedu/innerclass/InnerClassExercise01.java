package chapter10.com.hspedu.innerclass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerClassExercise01 {
    /*
     * 当做实参直接传递，简单高效
     * */
    public static void main(String[] args) {
        show(new AA() {
            @Override
            public void cry() {
                System.out.println("I am AA");
            } // 匿名内部类    });
        });


    }

    public static void show(AA a) {
        a.cry();
    }
}

interface AA {
    public void cry();
}

