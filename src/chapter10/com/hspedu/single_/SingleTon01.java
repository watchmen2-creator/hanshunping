package chapter10.com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        /*
         * 单例模式
         * 饿汉式和懒汉式单例模式的实现步骤：
         * （1）构造器私有化
         * （2）类的内部创建静态实例对象
         * （3）向外暴露一个静态的公共方法，返回内部创建的静态对象
         * */
//        GirlFriend girlFriend = new GirlFriend("女朋友1");
//        GirlFriend girlFriend2 = new GirlFriend("女朋友2");

        //用了单例模式，不管创建几个变量，指向的都是同一个对象
        GirlFriend girlFriend3 = GirlFriend.getInstance();
        GirlFriend girlFriend4 = GirlFriend.getInstance();
        System.out.println("girlFriend3 ' hashCode :" + girlFriend3.hashCode());
        System.out.println("girlFriend4 ' hashCode :" + girlFriend4.hashCode());
    }

}

//女朋友类，只能有一个对象
//这样写可以有多个女朋友
//class GirlFriend{
//    private String name;//姓名
//        public GirlFriend(String name){
//        this.name = name;
//    }
//
//}
class GirlFriend {
    private String name;//姓名

    private GirlFriend(String name) {
        this.name = name;
    }


    /*
     * 内部创建静态实例
     * 实例属性为啥只能是静态的？因为方法是静态的，静态方法只能使用静态属性
     * 饿汉式：没有使用实例，也去创建了，这样可能会造成资源的浪费，所以诞生了懒汉式
     * 懒汉式：使用时才去创建实例
     * */
    private static GirlFriend girlFriend = new GirlFriend("女朋友");

    //公共静态方法返回对象
    //方法为啥只能是静态的？因为方法如果不是静态的，就不能通过类来直接调用了，非静态方法必须用实例才能调用
    public static GirlFriend getInstance() {
        return girlFriend;
    }

}