package chapter10.com.hspedu.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    /*
     * 局部内部类：
     * 定义在外部类的局部位置（方法体或代码块中），并且有类名
     * 1.可以直接访问外部类的所有成员，包含私有的
     * 2.不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不用使用修饰符的。但是可以使用final修饰，因为局部变量也可以使用final
     * 3.作用域：仅仅在定义它的方法或代码块中
     * 4.局部内部类---访问---->外部类的成员 [访问方式：直接访问]
     * 5.外部类---访问---->局部内部类的成员 [访问方式：创建对象，再访问（注意：必须在作用域内）]
     * 6.本质仍然是一个类
     * 7.外部其他类不能访问局部内部类，因为局部内部类地位是一个局部变量
     * 8.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用：外部类名.this.成员 去访问
     *
     *
     * */
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02的hashcode=" + outer02);
    }
}

//外部类
class Outer02 {
    private int n1 = 100;

    //私有方法
    private void m2() {
        System.out.println("Outer02 m2()");
    }

    //方法
    public void m1() {
        //1.局部内部类是定义在外部类的局部位置,通常在方法
        //3.不能添加访问修饰符,但是可以使用final 修饰
        //4.作用域 : 仅仅在定义它的方法或代码块中

        //局部内部类(本质仍然是一个类)
        final class Inner02 {
            //2.可以直接访问外部类的所有成员，包含私有的
            private int n1 = 800;

            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员，比如下面 外部类n1 和 m2()
                //7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
                //   使用 外部类名.this.成员）去访问
                //   老韩解读 Outer02.this 本质就是外部类的对象, 即哪个对象调用了m1, Outer02.this就是哪个对象
                System.out.println("n1=" + n1 + " 外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this hashcode=" + Outer02.this);
                m2();
            }
        }

        //内部类
        class Inner003 {
        }
        //内部类继承内部类
        class Inner004 extends Inner003 {
        }
        //6. 外部类在方法中，可以创建Inner02（内部类）对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    //代码块
    {
        //代码块中的内部类
        class Inner01 {
        }
    }

}