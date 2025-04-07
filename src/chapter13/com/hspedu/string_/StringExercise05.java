package chapter13.com.hspedu.string_;

public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();//在堆中创建一个对象p1，p1的name属性为null
        p1.name = "hspedu";//p1的name属性指向常量池中的"hspedu"字符串对象
        Person p2 = new Person();//在堆中创建一个对象p2，p2的name属性为null
        p2.name = "hspedu";//p2的name属性也指向常量池中的"hspedu"字符串对象


        System.out.println(p1.name.equals(p2.name));//比较字符串是否相等，结果为：true
        System.out.println(p1.name == p2.name);  //p1.name和p2.name指向的是常量池中的同一个对象，结果为：True
        System.out.println(p1.name == "hspedu");   //p1.name指向常量池中的"hspedu"字符串对象，结果为：True

        String s1 = new String("bcde");//在堆中创建一个字符串对象s1，s1的value属性指向常量池中的"bcde"
        String s2 = new String("bcde");//在堆中创建一个字符串对象s2，s2的value属性指向常量池中的"bcde"
        System.out.println(s1 == s2); //s1和s2指向的是两个不同的对象，结果为：False

    }
}

class Person {
    public String name;
}