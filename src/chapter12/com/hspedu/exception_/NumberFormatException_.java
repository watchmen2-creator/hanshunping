package chapter12.com.hspedu.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
//        String str = "12345";
        String str = "12a345";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
