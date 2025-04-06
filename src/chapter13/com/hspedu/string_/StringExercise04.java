package chapter13.com.hspedu.string_;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hspedu"; //指向常量池”hspedu”
        String s2 = "java"; //指向常量池”java”
        String s4 = "java";//指向常量池”java”
        String s3 = new String("java");//指向堆中对象
        System.out.println(s2 == s3); // s2和s3指向不同对象，==比较的是地址，结果为：false
        System.out.println(s2 == s4);  //s2和s4指向都是常量池中的同一个对象，==比较的是地址，结果为：true
        System.out.println(s2.equals(s3));//比较的是值，结果为：true
        System.out.println(s1 == s2);  //s1和se指向常量池中的不同对象，==比较的是地址，结果为：false

    }
}
