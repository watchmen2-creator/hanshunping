package chapter10.com.hspedu.interface_;

public class Camera implements UsbInterface {//实现接口UsbInterface

    @Override
    public void start() {
        System.out.println("Camera is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Camera is stopping...");
    }
}
