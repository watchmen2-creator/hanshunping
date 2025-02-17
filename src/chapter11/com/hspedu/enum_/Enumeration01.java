package chapter11.com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        //创建Season对象
//        Season spring = new Season("春天", "温暖");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "凉爽");
//        Season winter = new Season("冬天", "寒冷");

        //对于季节而言，对象就是固定的四个，不会有其他季节
        //现有的设计思路不能提现季节是固定的四个对象，这种设计不好，因此引出了枚举类
//        Season other = new Season("某天", "~~~");

        /*
         * 枚举类：enumeration
         * 即把具体的对象一个一个的列举出来的类，就成为枚举类
         * 枚举是一组常量的集合
         * 枚举类可以看成是一种特殊的类，它有自己的构造器和方法，里面包含一组有限的特定的对象；不能被实例化，只能通过枚举类中的常量来访问
         * */

    }
}

//季节类
//季节的值是有限的：spring、summer、autumn、winter
//只读，不需要修改
//class Season {
//    private String Name;//季节名称
//    private String Description;//描述
//
//    //无参构造器
//    public Season() {
//        this.setName("春天");
//        this.setDescription("春季，阳光明媚，万物复苏。");
//    }
//
//    //构造器
//    public Season(String name, String description) {
//        this.setName(name);
//        this.setDescription(description);
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String description) {
//        Description = description;
//    }
//}