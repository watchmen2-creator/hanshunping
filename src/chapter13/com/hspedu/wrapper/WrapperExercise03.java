package chapter13.com.hspedu.wrapper;

public class WrapperExercise03 {
    public static void main(String[] args) {
        //示例一
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//两个不同对象，false
        //示例二
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//两个不同对象，false

        //示例三
        Integer i5 = 127;//底层Integer.valueOf(127)
        Integer i6 = 127;//-128~127
        System.out.println(i5 == i6); //不是创建对象，是用了valueOf方法，且数据在缓存数组范围内，true
        //示例四
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//不是创建对象，是用了valueOf方法，但数据不在缓存数组范围内，false
        //示例五
        Integer i9 = 127; //Integer.valueOf(127)
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//一个是缓存数组中的对象，一个是新对象，false

        //示例六
        Integer i11 = 127;//缓存数组中的对象
        int i12 = 127;//基本数据类型
        //只有有基本数据类型，判断的是
        //值是否相同
        System.out.println(i11 == i12); // i12 是基本数据类型，== 比较的是值，所以相等true
        //示例七
        Integer i13 = 128; //128超出缓存数组范围，是一个新对象
        int i14 = 128;
        System.out.println(i13 == i14);//i14 是基本数据类型，== 比较的是值，所以相等true


    }
}
