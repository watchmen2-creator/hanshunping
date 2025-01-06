package chapter08.com.hspedu.modifier;
/*
 * 修饰符可以用来修饰类中的属性、方法、类
 * 类的修饰符只有两种：public、默认
 * 属性和方法的修饰符有四种：public、protected、默认、private*/
/*
public：同一个类下、同一个包下、子类里面，不同包里面都可以访问
protected：同一个类下、同一个包下、子类里面，都可以访问；不同包里面，不可以访问
默认：同一个类下、同一个包下，都可以访问；子类里面、不同包里面，都不可以访问
private：同一个类下，可以访问；同一个包下、子类里面、不同包里面，都不可以访问
*/

public class modifier01 {
    //四个属性分别使用不同的修饰符
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //该方法在本包本类下边，可以访问四个属性
    public void m1() {
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }

}
