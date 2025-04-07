package chapter12.com.hspedu.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        /*
         * 如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
         * */

        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.print("请输入一个整数: ");
                num = Integer.parseInt(sc.nextLine()); //可能存在NumberFormatException数字格式不正确异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的整数是：" + num);
    }
}
