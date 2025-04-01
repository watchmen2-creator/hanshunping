package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passRiver();
        tang.passFlamesMounTain();
    }
}

interface IVehicles {
    void work();
}

class Horse implements IVehicles {
    @Override
    public void work() {
        System.out.println("一般情况骑马");
    }
}

class Boat implements IVehicles {
    @Override
    public void work() {
        System.out.println("遇到河的情况下就坐船");
    }
}

class Plane implements IVehicles {
    @Override
    public void work() {
        System.out.println("遇到火焰山就坐飞机");
    }
}

class VehiclesFactory {
    //马始终是同一匹马
    private static Horse horse = new Horse();//饿汉式单例模式，在类加载时就创建对象，避免频繁创建对象

    public IVehicles getVehicle(String type) {
        if (type.equals("Horse")) {
            return horse;
        } else if (type.equals("Boat")) {
            return new Boat();
        } else if (type.equals("Plane")) {
            return new Plane();
        }
        return null;
    }

    //工厂就创建一下对象，不用工厂的其他东西，所以可以不创建工厂的对象，把这两个方法做成静态方法
    public static Horse getHorse() {
        return horse;
    }

    //工厂就创建一下对象，不用工厂的其他东西，所以可以不创建工厂的对象，把这两个方法做成静态方法
    public static Boat getBoat() {
        return new Boat();
    }

    //工厂就创建一下对象，不用工厂的其他东西，所以可以不创建工厂的对象，把这两个方法做成静态方法
    public static Plane getPlane() {
        return new Plane();
    }

}

class Person {

    private String name;
    private IVehicles Vehicle;

//    public Person() {
//        setName("唐僧");
//        setVehicle(new Horse());
//    }

    public Person(String name, IVehicles vehicle) {
        setName(name);
        setVehicle(vehicle);
    }

    //遇到河要坐船
    public void passRiver() {
        if (!(Vehicle instanceof Boat)) {
            this.setVehicle(VehiclesFactory.getBoat());
        }
        Vehicle.work();
    }

    //一般情况骑马
    public void common() {
        //为了避免创建对象时传入的交通工具浪费，所以在这里判断一下是不是有交通工具了
        if (!(Vehicle instanceof Horse)) {//如果现在的交通工具不是马，就去工厂获得一个马
            this.setVehicle(VehiclesFactory.getHorse());
        }
        Vehicle.work();

    }
    //火焰山坐飞机
    public void passFlamesMounTain(){
        //为了避免创建对象时传入的交通工具浪费，所以在这里判断一下是不是有交通工具了
        if (!(Vehicle instanceof Plane)) {//如果现在的交通工具不是马，就去工厂获得一个马
            this.setVehicle(VehiclesFactory.getPlane());
        }
        Vehicle.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IVehicles getVehicle() {
        return Vehicle;
    }

    public void setVehicle(IVehicles vehicle) {
        Vehicle = vehicle;
    }
}
