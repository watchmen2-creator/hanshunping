package chapter12.com.hspedu.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result1 = num1 / num2;// 10 / 0
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("出现异常的原因是：" + e.getMessage());//把异常信息打印出来
        }

        /*
         * 如果认为一段代码可能出现问题，可以使用 try-catch 异常处理机制来解决
         * 从而增强代码的健壮性
         * 快捷键：
         * 将 代码块 选中后，按 Alt + Enter 快捷键，选择 Surround（环绕） 然后选择  try-catch 选项
         * 或使用Ctrl + Alt + T快捷键再选择 try-catch 选项（6），快速生成try-catch代码块
         * 如果进行了异常处理，那么即使了一场，程序可以继续执行，不会导致程序崩溃
         * */
        System.out.println("程序继续执行...");

    }

}
