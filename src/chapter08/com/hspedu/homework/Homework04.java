package chapter08.com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker("小明", 1000, 20);
        worker.setGrade(1.5);//设置级别为1.5
        worker.setBonus(500);//设置奖金为500
        System.out.println(worker);
        Manager manager = new Manager("经理", 1500, 30);
        manager.setGrade(1.5);//设置级别为1.5
        manager.setBonus(1000);//设置奖金为1000
        System.out.println(manager);
    }
}

class Employee {
    private String name;
    private double daySalary;//单日工资
    private double workDays;//工作天数
    private double grade;//等级
    private double bonus;//奖金

    public Employee(String name, double daySalary, double workDays) {
        this.setName(name);
        this.setDaySalary(daySalary);
        this.setWorkDays(workDays);
        this.setGrade(1.0);//默认等级为1.0
        this.setBonus(0.0);//默认奖金为0.0
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getWorkDays() {
        return workDays;
    }

    public void setWorkDays(double workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;//等级不是创建的时候定的，写成常量在类里面
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return getBonus() + getDaySalary() * getWorkDays() * getGrade();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", daySalary=" + getDaySalary() +
                ", workDays=" + getWorkDays() +
                ", grade=" + getGrade() +
                ", bonus=" + getBonus() +
                ", salary=" + getSalary() +
                '}';
    }
}

class Manager extends Employee {
    private double bonus;//奖金

    public Manager(String name, double daySalary, double workDays) {
        super(name, daySalary, workDays);
        this.setGrade(1.2);//经理的级别是1.2
        this.setBonus(1000);//默认奖金是1000
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Worker extends Employee {
    public Worker(String name, double daySalary, double workDays) {
        super(name, daySalary, workDays);
        this.setGrade(1.0);//普通员工的级别是1.0
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}