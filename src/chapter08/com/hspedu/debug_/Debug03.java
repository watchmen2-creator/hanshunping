package chapter08.com.hspedu.debug_;
/*
 * 断点调试（Debug）：
 * 在查找错误时，可以使用断点调试，一步一步的查看源码执行的过程，从而发现错误所在
 * 在断点调试过程是运行状态，是以对象的运行类型来执行的
 * 快捷键：
 * F7：跳入，跳入方法
 * 如果进不去方法，有两个办法，一个是Alt + shift + F7 强制跳入方法；
 * 另一个是在IDEA -> Setting -> Build,Execution,Deployment -> Debugger -> Stepping -> Do not step into the classes -> 取消勾选java.* 和javax.*
 * 然后应用，保存即可
 * F8：跳过，逐行执行代码
 * shift + F8 ：跳出方法，跟F7相反，F7跳进去方法，shift + F8挨个从方法里跳出来，跳回来
 * F9：resume，执行到下一个断点
 *
 * */

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        // 我们看看Arrays.sort方法底层实现.->Debug
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
