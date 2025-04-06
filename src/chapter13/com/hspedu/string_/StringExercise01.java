package chapter13.com.hspedu.string_;

public class StringExercise01 {
    public static void main(String[] args) {
        String a = "abc";//a 指向 常量池中"abc"的地址
        String b = "abc";//b 指向 常量池中"abc"的地址
        System.out.println(a.equals(b));//比较值是否相等，结果为：true
        System.out.println(a == b); //比较地址是否相等，因为指向的都是常量池中的同一个对象，结果为：true

    }
}
