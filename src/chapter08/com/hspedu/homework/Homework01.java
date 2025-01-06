package chapter08.com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        persons[0] = new Person("lucy", 32, "model");
        persons[1] = new Person("Jack", 24, "director");
        persons[2] = new Person("white", 56, "doctor");
        persons[3] = new Person("tom", 16, "director");
        persons[4] = new Person("Jack", 27, "JavaEE工程师");
        persons[5] = new Person("Jack", 50, "大数据工程师");
        persons[6] = new Person("mary", 89, "PHP工程师");
        persons[7] = new Person("Jack", 62, "director");
        persons[8] = new Person("Jack", 38, "director");
        persons[9] = new Person("Jack", 54, "director");

        //打印数据信息
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i] + "\t");
        }
        System.out.println();
        //冒泡排序
        int count = 0; //定义一个变量记录每轮循环交换的次数，如果本轮交换的次数为0，就说明拍好序了，就不执行后续循环了
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {//外层循环：n个元素，循环n-1次，每次把一个最大的元素排出来
            count = 0;
            for (int j = 0; j < persons.length - i - 1; j++) {//内层循环：在当前轮次，剩余的 n - 轮次 个元素里面找出最大值并排序
                //如果前面的年龄比后边的大就交换位置
                if (persons[j].getAge() > persons[j + 1].getAge()) {//如果左边比右边大就交换位置，从小到大排序
//                if (persons[j].getAge() < persons[j + 1].getAge()) {//若果左边比右边小就交换位置，从大到小排序
//                if (persons[j].getName().length() > persons[j + 1].getName().length()) {//如果左边比右边名字长度长就交换位置，按名字长度从小到大排序

                    count++;
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
            System.out.println((i + 1) + " 轮 ，交换了" + count + "次");
            System.out.println((i + 1) + " 轮 ，Person数据为：");
            //打印数据信息
            for (int v = 0; v < persons.length; v++) {
                System.out.print(persons[v] + "\t");
            }
            System.out.println();
            if (count == 0) {
                break;
            }
        }
        //打印数据信息
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i] + "\t");
        }
        System.out.println();
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
        this.setName("Tom");
        this.setAge(18);
        this.setJob("Teacher");
    }

    public Person(String name, int age, String job) {
        this.setName(name);
        this.setAge(age);
        this.setJob(job);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
