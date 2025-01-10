package chapter10.com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager m = new Manager("小明", 1001, 5000, 1000);
        m.work();

        CommonEmployee c = new CommonEmployee("小红", 1002, 3000);
        c.work();

    }
}

//abstract final class AA{}
abstract class BB {
//    abstract public static void method1();
//    abstract private void method2();
}

/*
 * 抽象类：Employee
 * 属性：name,id, salary
 * 抽象方法：work()
 * */
abstract class Employee {
    // 定义属性
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 定义抽象方法
    public abstract void work();
}

/*
 * 具体类：Manager
 * 特有属性：bonus
 * 继承自Employee
 * 实现抽象方法work()
 * */

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 正在管理工作");
    }
}

/*
 * 具体类：CommonEmployee
 * 继承自Employee
 * 实现抽象方法work()
 * */
class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + getName() + " 正在工作");
    }
}

