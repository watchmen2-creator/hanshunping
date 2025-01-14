package chapter10.com.hspedu.interface_;

public class InterfaceExercise02 {

}

interface IAA {
    int x = 0;
};

class BB {
    int x = 1;
}

class CC extends BB implements IAA {
    public void pX() {
        //没有明确是谁的x，所以编译器会报错
//        System.out.println(x);
        //使用父类的x就用super.x  使用接口中的x就用接口名.x
        System.out.println("super.x : " + super.x + " ;IAA.x : " + IAA.x);
    }

    public static void main(String[] args) {
        new CC().pX();
    }
};
