package chapter10.com.hspedu.final_;

public class FinalDetails01 {
    public static void main(String[] args) {
        /*
         * （1）final修饰的属性一般叫做常量，一般用大写字母命名。XX_XX_XX
         * （2）final修饰的属性在定义时，必须赋初值，并且以后不能修改。
         * 赋值可以在以下位置之一：定义时、构造器、代码块
         * （3）如果final修饰的属性是静态的，则初始化的位置只能是：定义时、代码块。不能在构造器中初始化。
         * （4）final类不能继承，但是可以实例化对象
         * （5）如果类不是final类，但是含有final方法，则该方法不能被重写，但能被继承。
         * （6）一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法了，因为final类不能被继承，方法就不会被重写
         * （7）final不能修饰构造方法（构造器）
         * （8）final 和 static 往往搭配使用，效率更高，不会导致类加载。底层编译器做了优化处理
         * （9）包装类：Integer、Long、Double、Float、Character、Boolean、String等都是final类，不能被继承，不能被修改
         * */

        //调用GG类的静态常量，不会导致类加载
        System.out.println(GG.x);//只会输出静态常量的值，不会导致类加载，也就不会调用GG的静态代码块


//        public final class Boolean implements java.io.Serializable,

    }
}

class AA {
    public final int x = 10;
    public final int y;
    public final int z;

    //代码块
    {
        z = 30; // 正确，可以在代码块中初始化final属性
    }

    //构造器
    public AA() {
//        x = 20; // 编译错误，不能修改final属性
        y = 20; // 正确，可以在构造器中初始化final属性
    }
}

class BB {
    //静态常量
    public static final int x = 10;// 正确，可以在静态代码块中初始化final属性
    public static final int y;//代码块中给只读属性赋值
//    public static final int z;//在构造器中赋值会报错，因为静态final属性不能在构造器中初始化

    //静态代码块
    static {
        y = 20; // 正确，可以在静态代码块中初始化final属性
    }

    //构造器
    public BB() {
//        z = 30;
    }
}

//final类
final class CC {

}

//继承final类会报错
//class DD  extends CC {}

class EE {
    //final方法
    public final void print() {
        System.out.println("print()");
    }
}

class FF extends EE {
    //final方法不能被重写，但能被继承
//    public void print() {
//        System.out.println("FF.print()");
//    }
    public void print2() {
        print(); //调用父类final方法
    }
}

class GG {
    //静态常量：final 和 static 往往搭配使用，效率更高，不会导致类加载。底层编译器做了优化处理
    public static final int x = 10;

    static {
        System.out.println("GG static block");
    }
}
