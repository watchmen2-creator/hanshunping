package chapter10.com.hspedu.interface_;

public class InterfaceDetails02 {
    public static void main(String[] args) {
        //证明接口中的属性是static的，可以直接通过接口名来访问
        //（7）接口中属性的访问形式：接口名.属性名
        System.out.println(IB.a);
        System.out.println(IB.b);
        //证明接口中的属性是final的，不能被修改
//        IB.a = 3; //编译错误，不能修改接口属性

    }
}

interface IB {
    //（6）接口中的属性，只能是 public static final 修饰的
    int a = 1;
    public static final int b = 2;
    //证明接口中的属性是public的，不可以修改访问权限
//        private int c = 3; //编译错误，不能修改接口属性

    void say();
}

interface IC {
    void hi();
}

//（8）一个接口不能继承其他的类，但是可以继承多个别的接口
//interface ID extends Cat{}
interface IE extends IB, IC {

}

//（5）一个类同时可以实现多个接口
class pig implements IB, IC {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}