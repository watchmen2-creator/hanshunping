package chapter11.com.hspedu.annotation_;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Deprecated_ {
    /*
     *
     * */
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

/*
 * @Deprecated 修饰后，表示该元素过时了，只是不推荐使用，但是仍可以使用
 * 可以修饰方法、类、字段、包、参数等等
 * @Deprecated 可以用来做版本升级过度使用
源码：
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 * */
@Deprecated
class A {
    private int a;

    public A() {
        a = 10;
    }

    @Deprecated
    public void hi() {
    }
}
