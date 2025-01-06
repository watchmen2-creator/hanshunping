package chapter08.com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.say());
        Person person2 = new Person("tom", 20);
        System.out.println(person2.say());
        Student student = new Student();
        System.out.println(student.say());
        Student student2 = new Student("lucy", 22, 22, 88.6);
        System.out.println(student2.say());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        this.setName("jack");
        this.setAge(18);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "I am " + this.getName() + " and I am " + this.getAge();
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student() {
        super();
        this.setId(0);
        this.setScore(60);
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.setId(id);
        this.setScore(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " and my score is " + this.getScore() + " and my id is  " + this.getId();
    }
}
