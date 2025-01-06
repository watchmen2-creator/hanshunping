package chapter08.com.hspedu.poly_;

public class Master {
    public String name;

    public Master(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void feed(Dog dog, Bone bone) {
//        System.out.println(this.name + " feeds " + dog.getName() + " with " + bone.getName());
//    }
//
//    public void feed(Cat cat, Fish fish) {
//        System.out.println(this.name + " feeds " + cat.getName() + " with " + fish.getName());
//    }
    //如果动物种类很多，食物种类也很多，那么就需要添加更多的feed方法
    //不利于扩展，违反了开闭原则
public void feed( Animal animal, Food food){
        System.out.println(this.name + " feeds " + animal.getName() + " with " + food.getName());
}
}
