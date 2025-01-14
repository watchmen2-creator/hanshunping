package chapter10.com.hspedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口类型的变量可以指向任何实现了该接口的类
        Icar car = new XiaoMi();//向上转型
        Icar car2 = new Benz();
        XiaoMi xiaoMi = new XiaoMi();
        Benz benz = new Benz();
    }
}

interface Icar {
}

class XiaoMi implements Icar {
}

class Benz implements Icar {
}