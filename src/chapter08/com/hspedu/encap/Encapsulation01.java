package chapter08.com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("jack888",300,30000);
//        person.setName("jack434");
//        person.setAge(30);
//        person.setSalary(30000);
        System.out.println(person.getPersonInfo());
    }
}


class Person {
    public String name;//名字是公开访问的
    private int age;//年龄是隐私，不公开
    private double salary;//工资是隐私，不公开

    //构造器可以和set结合使用
    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }


    //手写set、get太慢，可以使用快捷键alt+insert，然后使用getter、setter快速生成基础的结构，然后根据要求做完善修改
    //set里面可以做一下数据验证、校验的逻辑
    //get里面可以根据当前对象的权限，做一下权限控制，如果权限不对，就不返回

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;

        } else {
            System.out.println("名字长度不在2~6之间，给一个默认名字tom");
            this.name = "tom";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("年龄不在1~100范围内，给一个默认年龄18岁");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //返回所有person信息的方法
    public String getPersonInfo() {
        return "Name（姓名）: " + name + ", Age（年龄）: " + age + ", Salary（工资）: " + salary;
    }
}
