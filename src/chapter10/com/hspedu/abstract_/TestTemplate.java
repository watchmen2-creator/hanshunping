package chapter10.com.hspedu.abstract_;

/*
 * 需求：
 * 有多个类，完成不同的任务job
 * 要求能够得到各自任务的完成时间
 * */
public class TestTemplate {
    public static void main(String[] args) {
        AA a = new AA();
        a.time();

        BBB b = new BBB();
        b.time();
    }

}


