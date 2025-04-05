package chapter12.com.hspedu.try_;

public class TryCatchDetails {
    public static void main(String[] args) {
        try {
//            String str1 = "123a";
//            int a = Integer.parseInt(str1);//异常发生
//            System.out.println("a = " + a);//异常发生后，则异常后的代码不会执行，直接进入catch块


//            String str2 = "123";
//            int b = Integer.parseInt(str2);//无异常发生
//            System.out.println("b = " + b);//如果异常没有发生，则顺序执行try代码块，不会进入catch块

            D d = null;
            System.out.println(d.getA());//空指针异常发生

        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        } catch (NullPointerException e) { //如果有多个异常类型，可以继续添加 catch 块；子类异常类型的catch块写在前面，父类异常类型的catch块写在后面
            System.out.println("空指针异常：" + e.getMessage());
        } finally { //如果希望不管异常是否发生，都执行某段代码块，则使用 finally 块

            System.out.println("finally块");
        }


        try {
            int num1 = 10;
            int num2 = 0;
            System.out.println("num1/num2 = " + (num1 / num2));//异常发生
        } finally {//可以进行 try-finally 配合使用，这种用法相当于没有捕获异常，但强制执行 finally 块中的代码；如果有异发生则在执行完finally块后，代码会崩掉退出执行
            System.out.println("finally块执行....");
        }
        System.out.println("程序结束....");

    }
}

class D {
    private int a;

    public int getA() {
        return a;
    }
}