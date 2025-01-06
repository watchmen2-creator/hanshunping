package chapter08.com.hspedu.debug_;

/*
 * 断点调试（Debug）：
 * 在查找错误时，可以使用断点调试，一步一步的查看源码执行的过程，从而发现错误所在
 * 在断点调试过程是运行状态，是以对象的运行类型来执行的
 * 快捷键：
 * F7：跳入，跳入方法内
 * F8：跳过，逐行执行代码
 * shift + F8 ：跳出方法
 * F9：resume，执行到下一个断点
 *
 * */
public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行代码
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + i);
        }
        System.out.println("退出for....");
    }
}
