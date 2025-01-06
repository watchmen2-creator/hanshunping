package chapter08.com.hspedu.homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.introduce());
        teacher = new Teacher("Smith", 26, "教师", 16000.78,2.1);
        System.out.println(teacher.introduce());

        teacher = new Professor();
        System.out.println(teacher.introduce());
        teacher = new Professor("Sucre", 56, "教授", 56000.789,3.2);
        System.out.println(teacher.introduce());

        teacher = new AssociateProfessor();
        System.out.println(teacher.introduce());
        teacher = new AssociateProfessor("Benjamin", 44, "副教授", 36000.789,2.5);
        System.out.println(teacher.introduce());

        teacher = new Lecturer();
        System.out.println(teacher.introduce());
        teacher = new Lecturer("Sucre", 36, "讲师", 26000.789,2.2);
        System.out.println(teacher.introduce());

    }

}

class Teacher {
    private String name;//姓名
    private int age;//年龄
    private String post;//职称
    private double salary;//基本工资
    private double PayScale;//工资级别

    public Teacher() {
        this.setName("tom");
        this.setAge(18);
        this.setPost("教师");
        this.setPayScale(1.0);
        this.setSalary(28000.69 * this.getSalary());
    }

    public Teacher(String name, int age, String post, double salary, double payScale) {
        this.setName(name);
        this.setAge(age);
        this.setPost(post);
        this.setSalary(salary);
        this.setPayScale(payScale);
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPayScale() {
        return PayScale;
    }

    public void setPayScale(double payScale) {
        PayScale = payScale;
    }

    public String introduce() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() * getPayScale() +
                '}';
    }
}

class Professor extends Teacher {
    public Professor() {
        super();
        this.setPost("教授");
        this.setPayScale(1.3);
        this.setSalary(this.getSalary() * this.getPayScale());
    }

    public Professor(String name, int age, String post, double salary, double payScale) {
        super(name, age, post, salary, payScale);
    }

    @Override
    public String introduce() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() * getPayScale() +
                '}';
    }
}

class AssociateProfessor extends Teacher {
    public AssociateProfessor() {
        super();
        this.setPost("副教授");
        this.setPayScale(1.2);
        this.setSalary(this.getSalary() * this.getPayScale());
    }

    public AssociateProfessor(String name, int age, String post, double salary, double payScale) {
        super(name, age, post, salary, payScale);
    }

    @Override
    public String introduce() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() * getPayScale() +
                '}';
    }
}

class Lecturer extends Teacher {
    public Lecturer() {
        super();
        this.setPost("讲师");
        this.setPayScale(1.1);
        this.setSalary(this.getSalary() * this.getPayScale());
    }

    public Lecturer(String name, int age, String post, double salary, double payScale) {
        super(name, age, post, salary, payScale);
    }

    @Override
    public String introduce() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() * getPayScale() +
                '}';
    }
}