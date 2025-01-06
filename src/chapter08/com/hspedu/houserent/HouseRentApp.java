package chapter08.com.hspedu.houserent;

import chapter08.com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();//匿名对象的方法调用即可，不用创建一个变量指向具体的一个对象
        //HouseView().mainMenu()是一直展示菜单，如果退出方法了，就说明退出了，就在这打印一下退出了
        System.out.println("你退出了房屋出租系统");
    }
}
