package chapter08.com.hspedu.extend_.improve_;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    //打印信息
    public void showInfo() {
        System.out.println("学生姓名：" + name + "\t年龄：" + age + "\t分数：" + score);
    }
}
