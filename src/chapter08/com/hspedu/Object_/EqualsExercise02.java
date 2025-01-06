package chapter08.com.hspedu.Object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("hspedu");

        Person person2 = new Person();
        person2.setName("hspedu");

        System.out.println(person1 == person2);//==比较的是内存地址，对象不同，地址不同，返回false
        System.out.println(person1.getName().equals(person2.getName()));//equals比较的是对象，两个String的对象内容相同，返回true
        System.out.println(person1.equals(person2));//Person类里面重写了Object的equals方法，比较了内容，内容相同，返回true

        String s1 = new String("hspedu");
        String s2 = new String("hspedu");

        System.out.println(s1.equals(s2));//String类里面重写了Object类的equals方法，比较的是对象的内容，内容相同，返回true
        System.out.println(s1 == s2);//==比较的是内存地址，两个变量指向两个对象，地址不同，返回false
    }
}

