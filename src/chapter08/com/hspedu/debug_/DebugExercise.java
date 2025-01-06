package chapter08.com.hspedu.debug_;
/*
 * 断点调试（Debug）：
 * 在查找错误时，可以使用断点调试，一步一步的查看源码执行的过程，从而发现错误所在
 * 在断点调试过程是运行状态，是以对象的运行类型来执行的
 * 快捷键：
 * F7：跳入，跳入方法内
 * F8：跳过，逐行执行代码
 * shift + F8 ：跳出方法
 * F9：resume，执行到下一个断点
 *
 * */

public class DebugExercise {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        Person person2 = new Person("jack", 20);
        System.out.println(person2.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        this.setName("Tom");
        this.setAge(18);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    //重写Object类中的toString方法来展示对象的属性信息
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
