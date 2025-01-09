package chapter10.com.hspedu.codeblock_;

public class CodeBlockExercise {

}
/*练习1开始
class Person {
    public static int total;//静态变量
    static {//静态代码块
        total = 100;
        System.out.println("in static block!");//(1)
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("total = "+ Person.total); //100
        System.out.println("total = "+ Person.total); //100
    }
}

练习1结束 */
