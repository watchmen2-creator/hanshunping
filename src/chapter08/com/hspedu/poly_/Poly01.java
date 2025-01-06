package chapter08.com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("Tom");
        Animal animal = new Dog("大黄");
        Food food = new Bone("大棒骨头");
        master.feed(animal, food);
        animal = new Cat("小花猫");
        food = new Fish("鲤鱼");
        master.feed(animal, food);
        Pig pig = new Pig("大白猪");
        Rice rice = new Rice("大米");
        master.feed(pig, rice);

    }
}
