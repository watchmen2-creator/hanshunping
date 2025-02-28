package chapter11.com.hspedu.enum_;

public class EnumMethod {
    /*
     * 1. toString：Enum 类已经重写过了，返回的是当前对象的名称，子类可以重写该方法，用于返回对象的属性信息
     * 2. name：返回当前对象名（常量名），子类中不能重写
     * 3.ordinal：返回当前对象的位置号，默认从0开始
     * 4.values：返回当前枚举类中所有的常量
     * 5.valueOf：将字符串转化成枚举对象，要求字符串必须为已有的常量名，否则报异常！
     * 6.compareTo：比较两个枚举对象的位置（编号），默认按照枚举常量的顺序进行比较
     * */

    public static void main(String[] args) {
        //以使用Season2枚举类为例
        Season2 autumn = Season2.AUTUMN;//秋天

        //Enum 类已经重写过了，返回的是当前对象的名称
        System.out.println(autumn.toString()); //AUTUMN
        //输出枚举对象的名称
        System.out.println(autumn.name()); //AUTUMN
        //输出枚举对象的位置号，从0开始
        System.out.println(autumn.ordinal());//2
        //从反编译可以看到 values 方法，返回 Season2[] 数组，包含了所有的枚举对象
        Season2[] seasons = Season2.values();
        for (Season2 season : seasons) { //增强for循环遍历枚举对象
            System.out.println(season);
        }
        //5.valueOf：将字符串转化成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        Season2 season = Season2.valueOf("WINTER");
        System.out.println(season);//WINTER
        System.out.println(season == Season2.WINTER);//true
//        Season2 season2 = Season2.valueOf("HSP");//报异常，因为没有HSP这个常量名
        // 6.compareTo：比较两个枚举对象的位置（编号），默认按照枚举常量的顺序进行比较
        /*
        compareTo:
        *  return self.ordinal - other.ordinal;
        * */
        System.out.println(Season2.SPRING.compareTo(Season2.SUMMER));// 0 - 1 = -1
        System.out.println(Season2.SUMMER.compareTo(Season2.SPRING));// 1 - 0 = 1
        System.out.println(Season2.AUTUMN.compareTo(Season2.WINTER));// 2 - 3 = -1
        System.out.println(Season2.WINTER.compareTo(Season2.AUTUMN));// 3 - 2 = 1


    }
}
