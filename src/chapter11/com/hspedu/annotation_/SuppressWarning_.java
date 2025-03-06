package chapter11.com.hspedu.annotation_;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

import java.util.ArrayList;
import java.util.List;

public class SuppressWarning_ {
    /*
     * 抑制编译警告
     * 当我们不希望看到这些警告的时候，就可以使用 @SuppressWarnings 注解来抑制编译警告。
     * 注解可以应用到类、方法、变量、参数、构造器等。
     * 注解的语法格式为：@SuppressWarnings({"warning-name1,warning-name2"})
     * 其中，warning-name1,warning-name2 是编译器警告的名称，可以是以下名称：
     *
     * @SuppressWarnings 的作用范围跟放的位置有关：
     * 1. 在类上使用 @SuppressWarnings 注解，则抑制该类的所有警告。
     * 2. 在方法上使用 @SuppressWarnings 注解，则只抑制该方法的警告。
     * 3. 在变量、参数、构造器上使用 @SuppressWarnings 注解，则只抑制该变量、参数、构造器的警告。
     * 4. 在注解上使用 @SuppressWarnings 注解，则只抑制该注解的警告。
     *
     * 注意：
     * 1. @SuppressWarnings 注解只能用于编译器警告，不能用于运行时异常。
     * 2. @SuppressWarnings 注解只能用于源代码，不能用于编译后的字节码。
     * 3. @SuppressWarnings 注解可以同时抑制多个警告，多个警告之间用逗号隔开。
     * */
//    @SuppressWarnings("all")
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}
