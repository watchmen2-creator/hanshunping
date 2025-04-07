package chapter12.com.hspedu.throws_;

public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());//第3句：制造异常
        }
        ReturnExceptionDemo.methodB();
    }
}

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");//第1句
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("方法A结束");//第2句
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");//第4句
            return;
        } finally {
            System.out.println("方法B结束");//第5句
        }
    }
}
