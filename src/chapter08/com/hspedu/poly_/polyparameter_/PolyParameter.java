package chapter08.com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Manager("John", 25, 15000.0);
        employees[1] = new Manager("Jane", 25, 15000.0);
        employees[2] = new Staff("Tom", 25, 10000.0);
        employees[3] = new Staff("Mary", 25, 10000.0);
        Test test = new Test();
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].getName() + " salary: " + test.showEmpAnnal(employees[i]));
//            test.tsetWork(employees[i]);
//        }
        System.out.println("Employee 0 salary: " + test.showEmpAnnal(employees[0]));
        test.showEmpAnnal(employees[0]);//15000.0*13.5=202500.0
        test.tsetWork(employees[0]);
    }
}

class Test {
    public Double showEmpAnnal(Employee e) {
        return e.getAnnualSalary();//动态绑定机制，根据实际类型调用相应方法
    }

    public void tsetWork(Employee e) {
        if (e instanceof Manager) {
            ((Manager) e).manage();//向下转型
        } else if (e instanceof Staff) {
            ((Staff) e).work();//向下转型
        } else {
            System.out.println("Employee is working.");
        }
    }
}

class Employee {
    private String name;
    private int age;
    private double monthlySalary;


    public Employee() {
        this.setName("name");
        this.setAge(18);
        this.setmonthlySalary(18000.0);
    }

    public Employee(String name, int age, double monthlySalary) {
        this.setName(name);
        this.setAge(age);
        this.setmonthlySalary(monthlySalary);
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

    public double getmonthlySalary() {
        return monthlySalary;
    }

    public void setmonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.setBonus(this.getmonthlySalary() * 1.5);
    }

    public Manager(String name, int age, double monthlySalary) {
        super(name, age, monthlySalary);
        this.setBonus(this.getmonthlySalary() * 1.5);
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    // Override the getAnnualSalary method to add the bonus to the annual salary
    public double getAnnualSalary() {
        return super.getAnnualSalary() + getBonus();
    }

    // Add a new method of Manager class
    public void manage() {
        System.out.println("Manager is managing the team.");
    }
}

class Staff extends Employee {
    public Staff() {
        super();
    }

    public Staff(String name, int age, double monthlySalary) {
        super(name, age, monthlySalary);
    }

    @Override
    // Override the getAnnualSalary method to return 0.0
    public double getAnnualSalary() {
        return super.getAnnualSalary() + super.getmonthlySalary() * 0.1;
    }

    // Add a new method of Staff class
    public void work() {
        System.out.println("Staff is working.");
    }
}

