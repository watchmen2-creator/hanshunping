package chapter03;

public class ForceConvert {
    public static void main(String[] args) {
        int n1 = (int) 1.9;
        System.out.println("n1 = " + n1);
    }
}

class ForceConvertDetails {
    public static void main(String[] args) {

        int x = (int) (10 * 3.5 + 6 * 1.5);
        System.out.println(x);

        int n2 = 100;
        char c1 = 100;
        //char c2 = n2 ;
        char c3 = (char) n2;
        System.out.println(n2 + "\t" + c1 + "\t" + "c2" + "\t" + c3);
    }
}

class ForceConvertPractice {
    public static void main(String[] args) {

        short s = 12;
//        s = s - 9;
        System.out.println(s); //error

        byte b = 10;
//        b = b + 11;
        b = (byte) (b + 11);
        System.out.println(b);//error

        char c = 'a';
        int i = 16;
        float d = .314f;
        double result = c + i + d;
        System.out.println(result); //113.314

//        byte b = 16;
//        short s = 14;
//        short t = s + b;
//        System.out.println(t); //30
    }
}

