package chapter08.com.hspedu.Object_;

public class Equals01 {
    public static void main(String[] args) {
        /*
         * ==和equals()方法的区别
         * ==比较的是对象的内存地址，如果两个对象内存地址相同，则认为是同一个对象。
         * equals()方法比较的是对象的内容，如果两个对象内容相同，则认为是同一个对象。
         * 一般情况下，我们都建议使用equals()方法来比较对象是否相等，因为equals()方法可以提供更加精确的比较。
         * 但是，如果两个对象内容相同，但是又需要比较内存地址，则可以使用==来比较。
         * 例如，如果我们需要判断两个对象是否是同一个对象，则可以使用==来比较，因为两个对象内存地址相同，则认为是同一个对象。
         * 但是，如果我们需要判断两个对象是否内容相同，则可以使用equals()方法来比较，因为equals()方法比较的是对象的内容。
         * 总结：
         * 1.如果两个对象内存地址相同，则认为是同一个对象。 ==
         * 2.如果两个对象内容相同，则认为是同一个对象。equals()方法
         * 3.如果需要比较内存地址，则使用==。
         * 4.如果需要比较对象的内容，则使用equals()方法。
         * 5.如果两个对象内容相同，但是又需要比较内存地址，则可以使用==。
         * 6.如果两个对象内容相同，但是又需要比较对象的内容，则可以使用equals()方法。
         * ==：既可以判断基本类型，又可以判断引用类型。
         * ==如果比较的是基本类型，则比较的是值是否相同。
         * ==如果比较的是引用类型，则比较的是地址是否相同，即判定是不是同一个对象。
         * equals()：只能用于引用类型。
         * equals()是Object类中的方法，只能用于引用类型，用于比较两个对象是否内容相同。
         * */
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;
        System.out.println(a1 == a2);//比较的是内存地址，对象不一样，地址肯定不一样，所以false
        System.out.println(a1 == a3);//比较的是内存地址，对象一样，地址一样，所以true
        System.out.println(a1.equals(a2));//比较的是对象内容，对象不一样，内容肯定不一样，所以false
        System.out.println(a1.equals(a3));//比较的是对象内容，对象一样，内容一样，所以true
        B b1 = new B();
        A a4 = b1;
        A a5 = a4;
        System.out.println(a5 == b1);//比较的是内存地址，对象一样，地址一样，所以true
        System.out.println(a5.equals(b1));//比较的是对象内容，对象一样，内容一样，所以true



        /*
        * IDEA如何查看jdk源码？
        * 1.一般来说IDEA配置好JDK以后，可以直接在IDEA中查看源码。
        * 2.如果没有的话，就点击菜单栏File->Project Structure->PlatForm Settings->SDKs->选择Java SDK版本->再点击Sourcespath->点击的+号，选择本地JDK的源码文件的路径。
        * */
        "123".equals("123");//String类重写了equals方法，比较的是字符串内容，所以true
        Object o1 = new Object();
        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println("i1 == i2 : " + (i1 == i2));//比较的是内存地址，对象不一样，内容肯定不一样，所以false
        System.out.println("i1.equals(i2) : " + (i1.equals(i2)));//比较的是对象内容，对象虽然不一样，但是对象内容一样，所以true
        String s1 = new String(" abc" );
        String s2 = new String("abc");
        System.out.println("s1 == s2 : " + (s1 == s2));//比较的是内存地址，对象不一样，内容肯定不一样，所以false
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));//比较的是对象内容，对象虽然不一样，但是对象内容一样，所以true
    }
}

class A {
}

class B extends A {

}
