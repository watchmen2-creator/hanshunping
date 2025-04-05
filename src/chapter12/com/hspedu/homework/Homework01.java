package chapter12.com.hspedu.homework;


public class Homework01 {
    public static void main(String[] args) {
        //使用控制台传参


        try {
            //先验证输入的参数是否为两个
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确，请输入两个参数");
            }

            //将接受到的两个参数转成整数
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            //调用方法计算两数之商
            double result = cal(num1, num2);

            //输出结果
            System.out.println("两数之商为：" + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，请输入整数：");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0！");
        }


    }

    public static double cal(int num1, int num2) {
        return num1 / num2;
    }
}
