package chapter08.com.hspedu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;//t
        long I = (long) d;//t
        System.out.println(I);//13
        int in = 5;//t
//        boolean b = (boolean) in;//f
        Object obj = "hello";//t 向上转型
        String objStr = (String) obj;//t 向下转型
        System.out.println(objStr);//hello

        Object objPri = new Integer(5);//t 向上转型
//        String str = (String) objPri;//f 向下转型但是对象的类型不是String，是Integer，编译不报错运行报错
        Integer str1 = (Integer) objPri;//t 向下转型
    }
}

