package chapter10.com.hspedu.single_;


public class SingleTon02 {
    public static void main(String[] args) {
        BoyFriend boyFriend = BoyFriend.getInstance();
        BoyFriend boyFriend2 = BoyFriend.getInstance();
        System.out.println("boyFriend ' hashcode :" + boyFriend.hashCode());
        System.out.println("boyFriend2 ' hashcode :" + boyFriend2.hashCode());

        /*
        * 饿汉式和懒汉式
        * 二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建。
        * 饿汉式不存在线程安全问题，懒汉式存在线程安全问题。后面学习线程后再完善一下
        * 饿汉式存在浪费资源的可能。因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题。
        * 在 JavaSE 标准类中，java.lang.Runtime 就是经典的单例模式。
        * */
    }


}

class BoyFriend {
    private String name;

    private BoyFriend(String name) {
        this.name = name;
    }

    //懒汉模式：只是提前声明，但是不创建对象
    private static BoyFriend boyFriend;

    public static BoyFriend getInstance() {
        if (boyFriend == null) {//调用方法时，如果对象为空，则去创建对象
            boyFriend = new BoyFriend("男朋友");
        }
        return boyFriend;
    }
}
