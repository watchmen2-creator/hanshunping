package chapter10.com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;

        Child child = new Child("白骨精");
        child.join();
        count++;
        child.count++;

        Child child2 = new Child("红孩儿");
        child2.join();
        count++;
        child2.count++;

        Child child3 = new Child("蓝胖子");
        child3.join();
        count++;
        child3.count++;

        System.out.println("共有" + count + "个小伙伴加入了游戏");
        System.out.println("共有" + Child.count + "个小伙伴加入了游戏");
        System.out.println(child.count);
        System.out.println(child2.count);
        System.out.println(child3.count);

    }

}

class Child {
    private String name;
    public static int count = 0;//定义一个静态变量，该变量会被所有对象共享
    //类变量可以用类名来访问，而实例变量只能用对象来访问

    // 构造方法
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}