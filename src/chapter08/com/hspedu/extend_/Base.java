package chapter08.com.hspedu.extend_;

public class Base extends TopBase {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base()....");
    }
    public Base(int n) {
        System.out.println("Base(int n)....");
    }
    public Base(int n1, int n2) {
        System.out.println("Base(int n1, int n2)....");
    }

    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100....");
    }

    protected void test200() {
        System.out.println("test200....");
    }

    void test300() {
        System.out.println("test300....");
    }

    private void test400() {
        System.out.println("test400....");
    }

    public void calltest400() {
        test400();
    }
}
