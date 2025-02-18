package chapter11.com.hspedu.enum_;

public class Enumeration02 {
    /*
     * 1.不想要提供set方法，因为枚举对象指通常为只读的，不能修改其属性
     * 2.美剧独享 / 属性 使用 static + final 关键字共同修饰，实现底层优化
     * 3.枚举对象名通常使用全部大写，常量的命名规范
     * 4.枚举对象昂根据需要，也可以有多个属性
     * */
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
/*
 * 自定义类实现枚举的步骤：
 * 1、把构造器私有化，目的防止其他类创建对象
 * 2、去掉set方法，防止属性被修改 （可以提供 get 方法，但是不提供 set 方法）
 * 3、在Season类内部，直接创建固定的对象（本类内部创建一组固定的对象，对外暴露对象）
 * 4、优化，可以加入 final 关键字，防止被修改（public static final ）
 * 5、枚举对象名通常使用全部大写，常量的命名规范
 * 6、枚举对象昂根据需要，也可以有多个属性
 * */

class Season {
    private String Name;//季节名称
    private String Description;//描述

    public static final Season SPRING = new Season("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。");
    public static final Season SUMMER = new Season("夏天", "夏天是温暖的季节，适合去户外运动、散步、游览、欣赏大自然的美景。");
    public static final Season AUTUMN = new Season("秋天", "秋天是美丽的季节，适合去度假、观赏美景、欣赏古典音乐、品尝特色美食。");
    public static final Season WINTER = new Season("冬天", "冬天是寒冷的季节，适合去户外、散步、看雪景、品尝冷饮、听冷笑话。");

    //构造器
    //1、把构造器私有化，目的防止其他类创建对象
    //2、去掉set方法，防止属性被修改
    //3、在Season类内部，直接创建固定的对象
    //4、优化，可以加入 final 关键字，防止被修改
    private Season(String name, String description) {
        Name = name;
        Description = description;
    }

    public String getName() {
        return Name;
    }


    public String getDescription() {
        return Description;
    }

    //toString方法
    @Override
    public String toString() {
        return "Season2{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

}
