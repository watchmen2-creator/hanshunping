package chapter10.com.hspedu.interface_;

//phone 类 去实现接口UsbInterface
/*
 * 即phone 这个类 需要去实现UsbInterface 接口规定/声明的方法
 *
 * */
public class Phone implements UsbInterface {//实现接口UsbInterface

    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
