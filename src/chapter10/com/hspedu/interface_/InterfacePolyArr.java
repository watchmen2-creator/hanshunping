package chapter10.com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        IUsb[] usbArray = new IUsb[2];
        usbArray[0] = new IPhone();
        usbArray[1] = new ICamera();

        for (int i = 0; i < usbArray.length; i++) {
            if (usbArray[i] instanceof IPhone) {
                ((IPhone) usbArray[i]).call();
            }
            usbArray[i].fun();

        }
    }
}

interface IUsb {
    void fun();
}

class IPhone implements IUsb {
    public void call() {
        System.out.println("Iphone call");
    }

    @Override
    public void fun() {
        System.out.println("Iphone fun");
    }

}

class ICamera implements IUsb {
    @Override
    public void fun() {
        System.out.println("Camera fun");
    }

}