package chapter13.com.hspedu.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //以 Integer 转成 String 为例
        Integer i = 100;

        //方式1
        String s1 = i + "";
        //方式2
        String s2 = i.toString();
        //方式3
        String s3 = String.valueOf(i);

        //String 转成 包装类
        String str = "1234";
        Integer i1 = Integer.parseInt(str);//方式1：自动装箱
        Integer i2 = new Integer(str);//方式2：构造器

        System.out.println("ok~~");
    }
}
