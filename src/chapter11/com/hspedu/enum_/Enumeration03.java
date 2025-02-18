package chapter11.com.hspedu.enum_;


public class Enumeration03 {
    /*
     * 1.当我们使用 enum 关键字开发一个枚举类时，默认会集成 Enum 类，还是一个 final 类
     * 可以用 javap 工具反编译 Season2.class 文件查看
     * 2.传统的 public static final 类名 对象 等价于 对象名
     * 但是这里需要知道调用的是哪个构造器
     * 3.如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
     * 4.当有多个枚举对象时，使用 , 分隔，最后一个 ; 结束
     * 5.枚举对象必须放在枚举类的首行
     * */
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}

//演示使用emum关键字来定义枚举类
/*
 * 1.使用关键字 enum 来替代 class
 * 2.public static final Season2 SPRING = new Season2("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。");不用了
 * 直接换成：SPRING("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。")
 * 3.如果有多个常量（对象），中间用逗号隔开
 * 4.如果使用 enum 来实现枚举，要求将定义常量对象，写在枚举类的最前面，并用大写字母开头，后面跟上大写字母开头的常量名，再加上括号，括号中填入常量的名称和描述。
 * */
enum Season2 {

    SPRING("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。"),
    SUMMER("夏天", "夏天是温暖的季节，适合去海边、游泳、骑马、滑雪、登山、观赏大自然。"),
    AUTUMN("秋天", "秋天是美丽的季节，适合去度假、观赏美景、欣赏古典音乐、品尝特色美食。"),
    WINTER("冬天", "冬天是寒冷的季节，适合去户外、散步、看雪景、品尝冷饮、听冷笑话。");

    private String Name;//季节名称
    private String Description;//描述
//    public static final Season2 SPRING = new Season2("春天", "春天是最美丽的季节，适合去远足、游泳、骑马、滑雪、登山、观赏大自然。");
//    public static final Season2 SUMMER = new Season2("夏天", "夏天是温暖的季节，适合去户外运动、散步、游览、欣赏大自然的美景。");
//    public static final Season2 AUTUMN = new Season2("秋天", "秋天是美丽的季节，适合去度假、观赏美景、欣赏古典音乐、品尝特色美食。");
//    public static final Season2 WINTER = new Season2("冬天", "冬天是寒冷的季节，适合去户外、散步、看雪景、品尝冷饮、听冷笑话。");


    //构造器
    private Season2(String name, String description) {
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
        return "enum Season2{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

}
