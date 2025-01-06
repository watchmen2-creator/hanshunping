package chapter03.homework;

public class Homework {
    public static void main(String[] args) {
        System.out.println("go to execute other class");
    }
}


class Homework02 {
    public static void main(String[] args) {
        char[] c = {'\n', '\t', '\r', '\\', '1', '2', '3'};
        for (int i = 0; i <= 6; i++) {
            System.out.println(c[i]);
        }
    }
}

class Homework04 {
    public static void main(String[] args) {
        String name = "zhangsan";
        int age = 25;
        double score = 88.96;
        String gender = "boy";
        String hobby = "basketball";

        System.out.println("Name\tAge\tScore\tGender\tHobby\n" + name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);


    }
}

