package chapter13.com.hspedu.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "abc"; //a指向常量池中的字符串"abc"
        String b = new String("abc");
        System.out.println(a.equals(b));//判断两个字符串是否相等，结果为true
        System.out.println(a == b); //是两个不同的对象，结果为false
        System.out.println(a == b.intern());//当b调用intern()方法时，因为常量池中有"abc"，所以b.intern()返回的是向常量池中的字符串"abc"的对象，与a指向相同， 结果为true
        System.out.println(b == b.intern());//当b调用intern()方法时，因为常量池中有"abc"，所以b.intern()返回的是向常量池中的字符串"abc"的对象，但是b指向的是一个新的对象,b指向的对象与b.
    }
}
