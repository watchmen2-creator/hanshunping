package chapter08.com.hspedu.Object_;

public class Finalize_ {
    public static void main(String[] args) {
        /*
         * （1）当对象被回收时，系统自动调用该对象的finalize方法。
         * 子类可以重写该方法，做一些释放资源的操作
         * （2）什么时候被回收：当某个对象没有任何引用时，则JVM就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，
         * 在销毁该对象前，会先调用finalize方法
         * （3）垃圾回收机制的调用，是由系统(JVM的GC算法)来决定，但是也可以通过System.gc()主动触发垃圾回收机制
         * 开发人员可以在finalize中，写自己的业务逻辑代码（比如释放资源：数据库连接、或者打开文件..）
         * 如果开发人员不在自己的类里面重写finaliz方法，那么就会调用Object类的finalize方法
         * Object类的finalize方法里面没有内容，只是提供了这个机制
         * （4）实际开发中，几乎不会运用finalize方法，更多是为了面试
         * */
        Car car = new Car();
        System.out.println(car.toString());
        car = null;//这时car对象就是一个垃圾，垃圾回收机就会回收（销毁）对象
        //Car类里面重写了finalize方法
        //不是变成垃圾对象后就立马被回收，JVM是有自己的GC垃圾回收算法的，可以主动调用一下垃圾回收
        System.gc();//主动调用垃圾回收机制
        /*
        * JVM的垃圾回收机制可以想象公司里面每天6点下班后，保洁阿姨来打扫卫生
        * 不是有了垃圾，保洁阿姨就立马来打扫，而是有个GC算法的，之后老韩在讲JVM的时候讲
        * 如果觉得这块脏了也可以主动喊保洁阿姨来打扫，但是保洁阿姨来不来打扫是不确定的，大多数情况回来，但是会有情况不来
        * 就相当于可以主动调用System.gc()，来回收垃圾对象，但是不一样能百分百保证来回收
        * */
        System.out.println("End");
    }
}

class Car {
    private String name;

    public Car() {
        this.setName("宝马");
    }

    public Car(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    //重写Object类的finalize方法
    protected void finalize() throws Throwable {
        System.out.println("模拟释放了某些资源..");
        super.finalize();//默认调用的是父类的finalize方法，也就是Object类的finalize方法
    }
}