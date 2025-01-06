package chapter08.com.hspedu.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("张三", 30, "医生", "男", 8000);
        Doctor doctor2 = new Doctor("张三", 30, "医生", "男", 8000);
        Doctor doctor3 = doctor1;
        Doctor doctor4 = new Doctor("李四", 30, "医生", "男", 8000);
        System.out.println(doctor1.equals(doctor2));//不同对象（不同地址），但是对象的属性俊相同
        System.out.println(doctor1.equals(doctor3));//相同地址
        String str1 = "hello";
        System.out.println(doctor1.equals(str1));//两个对象的类型都不相同
        System.out.println(doctor1.equals(doctor4));//两个对象的类型相同，但是属性不同


    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

//    public Doctor() {
//    }

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setJob(job);
        this.setGender(gender);
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//先判断内存地址是否相等，内存地址相等肯定是同一个
            return true;
        }
        if (obj instanceof Doctor) {//再判断是不是同一类或子类，如果不是就肯定不想等，如果是就再判断各个属性是否相等
            return this.name.equals(((Doctor) obj).name) && this.age == ((Doctor) obj).age
                    && this.job.equals(((Doctor) obj).job) && this.gender.equals(((Doctor) obj).gender)
                    && this.salary == ((Doctor) obj).salary;
        } else {
            return false;
        }
    }

}
