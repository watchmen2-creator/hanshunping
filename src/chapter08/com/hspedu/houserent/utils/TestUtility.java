package chapter08.com.hspedu.houserent.utils;

/*
 * 这是一个测试类，使用完毕可以删掉
 * */
public class TestUtility {
    public static void main(String[] args) {
        //要求输入一个字符串，长度最大为3
        String s = Utility.readString(3);
        //这里直接使用类.方法() => 因为当一个方法是static 静态方法时，可以直接通过类名调用，不用创建对象
        //具体细节后面再说
        System.out.println("s = " + s);

        String s2 = Utility.readString(10, "hsp");
        System.out.println("s2 = " + s2);

//        AAAA.hi();//不是静态方法，需要对象才能调用
        AAAA.hihi();//静态方法，可以用类名直接调用
    }
}

class AAAA {
    public void hi() {
    }

    public static void hihi() {
    }
}
