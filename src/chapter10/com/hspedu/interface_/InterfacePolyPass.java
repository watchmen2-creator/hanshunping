package chapter10.com.hspedu.interface_;

/*
 * 演示多态传递现象
 * */
public class InterfacePolyPass {
    public static void main(String[] args) {
        II i = new Teacher();
        IH h = new Teacher();//II接口继承IH接口，Teacher类实现了II接口，所以相当于Teacher类实现了IH接口
    }
}

interface IH {
    void sayHello();
}

interface II extends IH {
}

class Teacher implements II {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am a teacher.");
    }
}