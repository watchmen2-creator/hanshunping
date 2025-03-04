package chapter11.com.hspedu.annotation_;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

import javafx.scene.Parent;

public class Override_ {
    /*
     * 注解（Annotation）也被称为元数据（Metadata），用于修饰解释 包、类、方法、属性、构造器、局部变量等数据信息
     * 和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，相当于嵌入在代码中的补充信息
     * 在 JavaSE 中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等
     * 在 JavaEE 中，注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替 Java EE 旧版中所遗留的繁冗代码和 XML 配置等。
     * 注解的语法格式为：@注解名(参数列表)
     *
     * 使用 Annotation 时，要在其前面增加 @ 符号，并把该 Annotation 当成一个修饰符使用。用于修饰它支持的程序元素
     * 一些基本的 Annotation ：
     * （1） @Override ：限定某个方法，是重写父类方法，该注解只能用于方法
     * （2） @Deprecated ：表示某个程序元素（类、方法）已经过时，不建议使用，该注解只能用于方法、类、变量、接口等
     * （3） @SuppressWarnings ：抑制编译器警告，该注解只能用于方法
     * （4） @SafeVarargs ：注解可以应用于泛型方法，用于抑制泛型方法的类型擦除警告
     * （5） @FunctionalInterface ：注解可以应用于接口，用于检查接口是否只包含一个抽象方法，该注解只能用于接口
     * （6） @Native ：注解可以应用于方法，表示该方法是用本地代码实现的，该注解只能用于方法
     * （7） @Target ：修饰注解的注解，称为元注解。注解可以应用于注解，用于指定注解可以修饰哪些程序元素
     * （8） @Documented ：注解可以应用于注解，用于指定注解是否应该被 javadoc 工具记录
     * （9） @Inherited ：注解可以应用于注解，用于指定注解是否应该被子类继承
     * */

    public static void main(String[] args) {
        /*
        * @Override 的说明：
         @Target(ElementType.METHOD)
         @Retention(RetentionPolicy.SOURCE)
         public @interface Override {
         }
        * 解读：如果发现了 @interface ，就说明这是一个注解类，不要当成是接口
        * Override 使用说明
        * 1.@Override 表示指定重写父类的方法（从编译层面验证），如果父类没有 fly 方法，则会报错
        * 2.如果不写 @Override 注解，而父类仍有 public void fly(){}，仍然构成重写
        * 3. @Override 只能修饰方法，不能修饰其他类、包、属性等等
        * 4.查看 @Override 注解原码为： @Target(ElementType.METHOD)，说明只能修饰方法
        * 5. @Target 是修饰注解的注解，称为元注解
        * */
    }
}

class Father {
    public void fly() {
        System.out.println("Father flying");
    }
}

//@Override
class Child extends Father {
    /*
     * 1. @Override 注解放在fly方法上，表示子类的fly方法重写了继承的方法，继承的可能是父类、接口等
     * 2.如果没有写这个注解，子类的方法还是重写了
     * 只不过写了之后，编译器就去会检查该方法是否真的重写了父类的方法：如果重写了则编译器通过，如果没有，编译器会报错
     * */
    @Override
    public void fly() {
        System.out.println("Child flying");
    }
}
