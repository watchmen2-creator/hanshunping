package chapter10.com.hspedu.static_;

public class StaticExercise02 {

}

class Person {  //StaticExercise02.java 2min 时间
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
        //id++;//错误, 静态方法中使用了普通属性

        return total;
    }

    public Person() {//构造器
        total++;  //total = 1
        id = total;//id = 1
    }
}

class TestPerson {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person.getTotalPerson()); //Number of total is 0
        Person p1 = new Person();
        System.out.println("Number of total is " + Person.getTotalPerson()); //Number of total is 1
    }
}