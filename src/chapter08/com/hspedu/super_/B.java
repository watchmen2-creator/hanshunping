package chapter08.com.hspedu.super_;

public class B extends A {
    /*
     * super基本语法
     * （1）访问父类可以访问到的属性：public、protected、默认；super.属性名
     * （2）访问父类可以访问到的方法：public、protected、默认；super.方法
     * （3）访问父类的构造器，只能放在构造器里面第一句，只能出现一句；super()
     * */
    public void hi(){
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    public B(){
        super();
    }
}
