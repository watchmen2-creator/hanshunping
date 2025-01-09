package chapter10.com.hspedu.final_;

public class FinalExercise01 {

}

//类：圆
class Circle {
    //静态常量：圆周率
    public static final double PI = 3.14;
    public static final double PI2;
    public final double PI3;


    //静态代码块：初始化PI
    static {
        PI2 = 3.1415926;//静态常量在静态代码块中初始化
    }

    //半径
    private double radius;

    //构造方法
    public Circle(double radius) {
        this.radius = radius;
        PI3 = 3.14;//实例常量在构造方法中初始化
    }

    //计算周长
    public double perimeter() {
        return 2 * PI * radius;
    }

    //计算面积
    public double area() {
        return PI * radius * radius;
    }
}

class Something {
    public int addOne(final int x) {
//        ++x;//局部常量不能修改，会报错
        return x + 1;
    }
}