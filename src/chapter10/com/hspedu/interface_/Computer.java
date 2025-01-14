package chapter10.com.hspedu.interface_;

public class Computer {
    //形参是接口类型
    //接口类型的形参可以传入实现了该接口的类的对象实例
    public void work(UsbInterface usbInterface) {//形参是接口类型
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
