package chapter08.com.hspedu.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("**********************");
        Gradute gradute = new Gradute();
        gradute.name = "大毛";
        gradute.age = 20;
        gradute.testing();
        gradute.setScore(80);
        gradute.showInfo();
    }
}
