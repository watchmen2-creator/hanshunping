package chapter08.com.hspedu.pkg;

import chapter08.com.hspedu.modifier.modifier01;

/*chapter08.com.hspedu.pkg包下的TestModifier类
 与package chapter08.com.hspedu.modifier包下的modifier01类：不同包，不是父子类关系
 只能访问public 的属性、方法
 能访问（创建类的对象）到package chapter08.com.hspedu.modifier包下的modifier01类是因为这个类是public修饰的
 */
public class TestModifier {
    public static void main(String[] args) {
        modifier01 mod = new modifier01();
        mod.m1();
        System.out.println("mod.n1 = " + mod.n1);
//        System.out.println("mod.n2 = " + mod.n2);//不能访问protected修饰的属性
//        System.out.println("mod.n3 = " + mod.n3);//不能访问默认的属性
//        System.out.println("mod.n4 = " + mod.n4);//不能访问private修饰的属性
    }
}
