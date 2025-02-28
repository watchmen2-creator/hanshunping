package chapter11.com.hspedu.enum_;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week.toString());
        }
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String name;

    //构造方法
    private Week(String name) {
        this.name = name;
    }

    //获取星期名称

    @Override
    public String toString() {
        return name;
    }
}

