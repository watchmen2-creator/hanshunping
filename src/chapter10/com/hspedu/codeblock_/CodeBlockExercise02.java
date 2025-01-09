package chapter10.com.hspedu.codeblock_;

public class CodeBlockExercise02 {
}

/*练习2开始

练习2结束 */
class Sample {
    //构造器
    Sample(String s) {
        System.out.println(s);
    }

    //构造器
    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}

class Test {
    //普通属性初始化
    Sample sam1 = new Sample("sam1成员初始化");//
    //静态属性初始化
    static Sample sam = new Sample("静态成员sam初始化 ");//

    //静态代码块
    static {
        System.out.println("static块执行");//
        if (sam == null) System.out.println("sam is null");
    }

    //构造器
    Test() {
        System.out.println("Test默认构造函数被调用");//
    }

    //主方法
    public static void main(String str[]) {
        Test a = new Test();//无参构造器
    }
}