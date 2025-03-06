package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework02 {
     /*
1.在Frock类中声明私有的静态属性currentNum[int类型]，初始值为100000，作为衣服出厂的序列号起始值。
2.声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，并作为返回值。
3.在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印输出。
4.在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法；
5.在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，赋给serialNumber属性。
6.在TestFrock类的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增
 */

}

class Frock {
    private static int currentNum = 100000;//衣服出厂的序列号起始值
    private int serialNumber;//衣服的序列号

    public Frock() {
        this.serialNumber = getNextNum();
    }

    //生成上衣唯一序列号的方法，每调用一次，将 currentNum 增加 100 ，并作为返回值
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

class TsetFrock {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock rock1 = new Frock();
        Frock rock2 = new Frock();
        Frock rock3 = new Frock();
        System.out.println(rock1.getSerialNumber());
        System.out.println(rock2.getSerialNumber());
        System.out.println(rock3.getSerialNumber());
    }
}
