package chapter08.com.hspedu.extend_.improve_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(60.66);
        pupil.showInfo();
        System.out.println("**********************");
        Gradute gradute = new Gradute();
        gradute.name = "大毛~";
        gradute.age = 22;
        gradute.testing();
        gradute.setScore(80.8);
        gradute.showInfo();
    }
}
