package chapter13.com.hspedu.wrapper;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;
        Float f = 1.5f;

        Object obj1 = true ? new Integer(1) : new Double(2); // 三元运算符要看做一个整体，因为有Double，提升了精度，所以是1.0
        System.out.println(obj1);// 输出1.0而不是1
        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(1);//分别计算，不会提升精度
        }
        System.out.println(obj2); // 输出1

    }
}
