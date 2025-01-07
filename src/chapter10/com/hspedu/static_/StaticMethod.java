package chapter10.com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("tom");
        stu.payFee(200);
        Stu stu1 = new Stu("jack");
        stu1.payFee(300);
        Stu.showFee();
        /*
         * 如果我们希望不创建对象也可以使用方法，这个方法就相当于一个工具
         * 那就把方法做成静态方法是非常合适的，
         * */
        System.out.println("1 + 2 = " + myTools.sum(1, 2));

    }
}

class myTools {
    public static int sum(int a, int b) {
        return a + b;
    }
}

class Stu {
    private String name;
    //定义一个静态变量，来累计学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getFee() {
        return fee;
    }

    //当使用Static 修饰后，方法就变成了静态方法
    //静态方法就可以访问静态属性
    public static void setFee(double fee) {
        Stu.fee = fee;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费为：" + Stu.fee);
    }

}
