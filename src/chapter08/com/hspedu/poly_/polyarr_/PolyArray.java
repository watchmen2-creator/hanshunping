package chapter08.com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Alice", 17);
        persons[1] = new Student("Tom", 18, 90.00);//向上转型
        persons[2] = new Student("Jerry", 19, 85.00);//向上转型
        persons[3] = new Teacher("Jack", 23, 30000.00);//向上转型
        persons[4] = new Teacher("Jane", 30, 30500.00);//向上转型
        for (int i = 0; i < persons.length; i++) {
            //person[i]编译类型是Person，运行类型是根据实际情况由JVM机来判断
            persons[i].say();//动态绑定机制，调用say方法
            if (persons[i] instanceof Student) {//如果运行类型是Student，调用study方法
                ((Student) persons[i]).study();//向下转型
            } else if (persons[i] instanceof Teacher) {//如果运行类型是Teacher，调用teach方法
                ((Teacher) persons[i]).teach();//向下转型
            } else if (persons[i] instanceof Person) {
                //如果是Person类型，什么也不做
            } else {
                System.out.println("Unknown type.");
            }
        }
    }
}

class Person {
    private String name;//姓名
    private int age;//年龄

    public Person() {
        this.setName("Tom");
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

    public void say() {
        System.out.println("Hello, my name is " + this.getName() + " and I am " + this.getAge() + " years old.");
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher() {
        super();
        this.setSalary(20000.00);
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写父类say方法
    @Override
    public void say() {
        System.out.println("Hello, my name is " + this.getName() + " and I am " + this.getAge() + " years old. My salary is " + this.getSalary() + " yuan.");
    }

    //子类特有方法
    public void teach() {
        System.out.println("I am teaching...");
    }
}

class Student extends Person {
    private double score;//属性如果没有特别说明是什么修饰符，默认就写私有private

    public Student() {
        super();
        this.setScore(85.00);
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say方法
    @Override
    public void say() {
        System.out.println("Hello, my name is " + this.getName() + " and I am " + this.getAge() + " years old. My score is " + this.getScore() + " and I am a student.");
    }

    //子类特有方法
    public void study() {
        System.out.println("I am studying...");
    }
}