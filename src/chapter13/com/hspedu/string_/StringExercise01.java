package chapter13.com.hspedu.string_;

public class StringExercise01 {
    public static void main(String[] args) {


        //创建String 对象的两种方式
        //方式一：直接赋值  String s1 = "hello";
        //方式二：通过构造器创建 String s2 = new String("world");
        //两种方式创建 String 对象的区别
        /*
        方式一创建：先从常量池中查看是否有“hello”这个字符串，若该值已经存在，直接让 s1 指向常量池。否则，先在常量池创建，s1 再指向它。
        s1 最终指向的是常量池中的空间地址
        方式二是，先在堆中创建空间，里面有value属性，value属性指向常量池的空间地址。
        若该值在常量池中已经存在，则让value属性指向常量池。若不存在，先在常量池创建，再指向。
        最终指向的s2变量的value属性指向堆中的空间地址

         */


        String a = "abc";//a 指向 常量池中"abc"的地址
        String b = "abc";//b 指向 常量池中"abc"的地址
        System.out.println(a.equals(b));//比较值是否相等，结果为：true
        System.out.println(a == b); //比较地址是否相等，因为指向的都是常量池中的同一个对象，结果为：true

    }
}
