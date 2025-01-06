package chapter10.com.hspedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);// 访问静态变量：类名.静态变量名
        //静态变量是随着类的加载而加载，所以访问静态变量不需要创建对象
        A a = new A();
        System.out.println(a.name);// 访问静态变量：对象名.静态变量名
    }
}

class A {
    //类变量的访问，遵守相关的访问权限
    public static String name = "韩顺平教育";// 静态变量
}
