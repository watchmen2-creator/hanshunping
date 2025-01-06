package chapter08.com.hspedu.homework.homework05;

public class Homework05 {
    public static void main(String[] args) {
        //创建员工对象
        Employee[] employees = new Employee[6];
        employees[0] = new Worker("张三", 25, 5000);
        employees[1] = new Peasant("李四", 20, 3000);
        employees[2] = new Teacher("王五", 30, 8000, 1000,150);
        employees[3] = new Scientist("李四", 35, 10000, 2000);
        employees[4] = new Waiter("赵六", 28, 4000);
        employees[5] = new Employee("李四", 20, 3000);
        //打印员工信息
        Test test = new Test();
        //调用printSalary方法，打印员工的工资信息
        for (int i = 0; i < employees.length; i++) {
            test.printSalary(employees[i]);
        }


    }


}

class Test {
    public void printSalary(Employee employee) {
        if (employee instanceof Worker) {
            System.out.println((Worker) employee);
            System.out.println(((Worker) employee).printSalary());
        } else if (employee instanceof Peasant) {
            System.out.println((Peasant) employee);
            System.out.println(((Peasant) employee).printSalary());
        } else if (employee instanceof Teacher) {
            System.out.println((Teacher) employee);
            System.out.println(((Teacher) employee).printSalary());
        } else if (employee instanceof Scientist) {
            System.out.println((Scientist) employee);
            System.out.println(((Scientist) employee).printSalary());
        } else if (employee instanceof Waiter) {
            System.out.println((Waiter) employee);
            System.out.println(((Waiter) employee).printSalary());
        } else {
            System.out.println(employee);
            System.out.println(employee.printSalary());
        }
    }
}

//定义一个员工类，
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double printSalary() {
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", printSalary=" + printSalary() +
                '}';
    }
}

//定义一个工人类，继承自员工类
class Worker extends Employee {
    public Worker(String name, int age, double salary) {
        super(name, age, salary);
    }

    //重写printSalary方法，返回固定值
    @Override
    public double printSalary() {
        return getSalary();
    }

    //重写toString方法，返回父类的toString方法
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", printSalary=" + printSalary() +
                '}';
    }
}

//定义一个农民类，继承自员工类
class Peasant extends Employee {
    public Peasant(String name, int age, double salary) {
        super(name, age, salary);
    }

    //重写printSalary方法，返回固定值
    @Override
    public double printSalary() {
        return getSalary();
    }

    //重写toString方法，返回父类的toString方法
    @Override
    public String toString() {
        return "Peasant{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", printSalary=" + printSalary() +
                '}';
    }
}

//定义一个教师类，继承自员工类
class Teacher extends Employee {
    private double classRemuneration;//课酬（元/天）
    private double classDay; //课时（天）
    private double classSalary; //课酬总额（元）

    public Teacher(String name, int age, double salary, double classRemuneration,double classDay) {
        super(name, age, salary);
        this.setClassRemuneration(classRemuneration);
        this.setClassDay(classDay);
        this.setClassSalary();
    }

    public double getClassRemuneration() {
        return classRemuneration;
    }

    public void setClassRemuneration(double classRemuneration) {
        this.classRemuneration = classRemuneration;
    }

    public double getClassDay() {
        return classDay;
    }

    public void setClassDay(double classDay) {
        this.classDay = classDay;
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary() {
        this.classSalary = getClassRemuneration() * getClassDay();
    }

    //重写printSalary方法，返回固定值
    @Override
    public double printSalary() {
        return getSalary() + getClassSalary();
    }

    //重写toString方法，返回父类的toString方法
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ",classRemuneration=" + getClassRemuneration() +
                ", classDay=" + getClassDay() +
                ", classSalary=" + getClassSalary() +
                ", printSalary=" + printSalary() +
                '}';
    }
}

//定义一个科学家类，继承自员工类
class Scientist extends Employee {
    private double bonus; //奖金（元）

    public Scientist(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重写printSalary方法，返回固定值
    @Override
    public double printSalary() {
        return getSalary() + getBonus();
    }

    //重写toString方法，返回父类的toString方法
    @Override
    public String toString() {
        return "Scientist{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus() +
                ", printSalary=" + printSalary() +
                '}';
    }


}

//定义一个厨师类，继承自员工类
class Waiter extends Employee {
    public Waiter(String name, int age, double salary) {
        super(name, age, salary);
    }

    //重写printSalary方法，返回固定值
    @Override
    public double printSalary() {
        return getSalary();
    }

    //重写toString方法，返回父类的toString方法
    @Override
    public String toString() {
        return "Waiter{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", printSalary=" + printSalary() +
                '}';
    }
}
