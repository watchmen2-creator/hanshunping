package chapter10.com.hspedu.innerclass;

public class AnonymousInnerClassDetails {
    /*
     * 3.可以直接访问外部类的成员变量和方法，包括私有成员变量和方法
     * 4.不能添加访问修饰符，因为匿名内部类的地位就是一个局部变量
     * 5.作用域：仅仅在定义它的方法或代码块中
     * 6.匿名内部类---访问---->外部类成员 [访问方式：直接访问]
     * 7.外部其他类---不能访问---->匿名内部类（因为 匿名内部类地位是一个局部变量）
     * 8.如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
     * */
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        outer.fun1();
    }
}

class Outer5 {
    private int n1 = 10;

    public void fun1() {
        Person person = new Person("John", 25) {
            private int n1 = 20;

            @Override
            public void display() {
                System.out.println(n1 + "  &  Inner09 class display method  &  " + Outer5.this.n1);
            }
        };
        person.display();

        new Person("John", 25) {
            @Override
            public void hi(String str) {
                System.out.println("Hi~~~~: " + str);
            }
        }.hi("Anonymous inner class");
    }
}


class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void hi(String str) {
        System.out.println("Hi: " + str);
    }
}