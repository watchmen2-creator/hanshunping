package chapter08.com.hspedu.extend_;

public class ExtendsDetails {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.sayOk();
        System.out.println("==========================");
        Sub sub2 = new Sub(5);
        sub2.sayOk();
    }
}
