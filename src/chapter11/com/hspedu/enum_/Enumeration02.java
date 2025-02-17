package chapter11.com.hspedu.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        String n = "123";
    }
}

class Season {
    private String Name;//季节名称
    private String Description;//描述

    public static Season SPRING = new Season("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。");
    public static Season SUMMER = new Season("夏天", "夏天是温暖的季节，适合去户外运动、散步、游览、欣赏大自然的美景。");
    public static Season AUTUMN = new Season("秋天", "秋天是美丽的季节，适合去度假、观赏美景、欣赏古典音乐、品尝特色美食。");
    public static Season WINTER = new Season("冬天", "冬天是寒冷的季节，适合去户外、散步、看雪景、品尝冷饮、听冷笑话。");

    //构造器
    //1、把构造器私有化，目的防止其他类创建对象
    //2、去掉set方法，防止属性被修改
    //3、在Season类内部，直接创建固定的对象
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
        return "Season{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

}
