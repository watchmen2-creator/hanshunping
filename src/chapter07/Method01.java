package chapter07;

public class Method01 {
    public static void main(String[] args) {
		Person1 p = new Person1();
        p.speak();
        System.out.println(p.calc01(1000));
        System.out.println(p.getSum(1, 2));


    }
}

class Person1 {
    String name;
    int age;

    public void speak() {
        System.out.println("I am a nice Person");
    }

    public int calc01(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public double getSum(double m, double n) {
        return (m + n);
    }


}
