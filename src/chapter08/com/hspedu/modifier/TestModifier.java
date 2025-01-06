package chapter08.com.hspedu.modifier;

//TestModifier类、modifier类 在同一个包下，不是父子类关系，modifier类中默认、protected、public的属性和方法都可以访问
public class TestModifier {
    public static void main(String[] args) {
        modifier01 m01 = new modifier01();
        m01.m1();
        System.out.println("m01.n1 = " + m01.n1);//可以访问public属性
        System.out.println("m01.n2 = " + m01.n2);//可以访问protected属性
        System.out.println("m01.n3 = " + m01.n3);//可以访问默认属性
//        System.out.println("m01.n4 = " + m01.n4);//不可以访问private属性

    }
}
