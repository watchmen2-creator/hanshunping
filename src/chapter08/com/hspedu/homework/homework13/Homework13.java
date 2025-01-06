package chapter08.com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("张三", "男", 20, 1001);
        persons[1] = new Student("李四", "女", 22, 1002);
        persons[2] = new Teacher("王五", "男", 30, 3);
        persons[3] = new Teacher("毛六", "女", 36, 5);

        //冒泡排序：年龄从高到低
        boolean ischange;//记录每轮是否交换
        Person person;//临时变量，用于交换数组中两个对象的顺序
        for (int i = 0; i < persons.length - 1; i++) {
            ischange = false;
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {//如果年龄比右边的小，就交换位置
                    ischange = true;//本轮发生交换
                    person = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = person;
                }
            }
            if (!ischange) {//如果本轮没发生交换，就退出循环
                break;
            }
        }
        Function function = new Function();
        for (int i = 0; i < persons.length; i++) {
            function.personPlay(persons[i]);
        }

    }
}

class Function {
    public void personPlay(Person person) {
        if (person instanceof Student) {
//            System.out.println(((Student) person).play());
//            ((Student) person).study();
            System.out.println(((Student) person).printInfo());
        } else if (person instanceof Teacher) {
//            System.out.println(((Teacher) person).play());
//            ((Teacher) person).teach();
            System.out.println(((Teacher) person).printInfo());
        } else {
//            System.out.println(person.play());
            System.out.println(person.printInfo());
        }
    }
}


class Person {
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄
    //此处先注释无参构造器，先不用这个
    //无参构造器，给属性赋默认值
//    public Person() {
//    }

    public Person(String name, String sex, int age) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return getName() + " 爱玩...";
    }


    public String printInfo() {
        return "人的信息：" + "\n" +
                "姓名：" + getName() + "\n" +
                "年龄：" + getAge() + "\n" +
                "性别：" + getSex() + "\n" +
                play();
    }
}


class Student extends Person {
    private int stuId;//特有属性：学号

    public Student(String name, String sex, int age, int stuId) {
        super(name, sex, age);
        this.setStuId(stuId);
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    //特有方法
    public String study() {
        return "我承诺，我会好好学习";
    }

    //重写Person的play方法
    @Override
    public String play() {
        return getName() + " 爱玩足球";
    }

    @Override
    public String printInfo() {
        return "学生的信息：" + "\n" +
                "姓名：" + getName() + "\n" +
                "年龄：" + getAge() + "\n" +
                "性别：" + getSex() + "\n" +
                "学号：" + getStuId() + "\n" +
                study() + "\n" +
                play();
    }
}


class Teacher extends Person {
    private int workAge;//特有属性：工龄

    public Teacher(String name, String sex, int age, int workAge) {
        super(name, sex, age);
        this.setWorkAge(workAge);
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    //特有方法
    public String teach() {
        return "我承诺，我会认真教学";
    }

    //重写Person的play方法
    @Override
    public String play() {
        return getName() + "爱玩象棋";
    }

    @Override
    public String printInfo() {
        return "老师的信息：" + "\n" +
                "姓名：" + getName() + "\n" +
                "年龄：" + getAge() + "\n" +
                "性别：" + getSex() + "\n" +
                "工龄：" + getWorkAge() + "\n" +
                teach() + "\n" +
                play();
    }
}
