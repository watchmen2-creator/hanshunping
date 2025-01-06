package chapter08.com.hspedu.pkg;

//import java.util.Scanner;//表示只引入java.util包下的Scanner类
//import java.util.*;//表示将这个包下的所有类都引入，建议还是需要使用哪个类就引入哪个类，不建议使用*的方式导入

import java.lang.reflect.Array;
import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的Arrays完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        System.out.println(Arrays.toString(arr));
        //传统方法是自己编写排序算法，将数组排序，比如bubbleSort冒泡排序
        //实际上系统有提供相关的类，可以方便完成
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
