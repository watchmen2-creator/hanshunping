package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework06 {
    public static void main(String[] args) {

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

class VehiclesFactory {
    public IVehicles getVehicle(String type) {
        if (type.equals("Horse")) {
            return new Horse();
        } else if (type.equals("Boat")) {
            return new Boat();
        }
        return null;
    }

    //工厂就创建一下对象，不用工厂的其他东西，所以可以不创建工厂的对象，把这两个方法做成静态方法
    public static Horse getHorse() {
        return new Horse();
    }

    //工厂就创建一下对象，不用工厂的其他东西，所以可以不创建工厂的对象，把这两个方法做成静态方法
    public static Boat getBoat() {
        return new Boat();
    }

}

class Person {
    private String name;
    private IVehicles Vehicle;

    public Person() {
        setName("唐僧");
        setVehicle(new Horse());
    }

    public Person(String name, IVehicles vehicle) {
        setName(name);
        setVehicle(vehicle);
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
