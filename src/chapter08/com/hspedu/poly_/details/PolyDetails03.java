package chapter08.com.hspedu.poly_.details;

public class PolyDetails03 {
    public static void main(String[] args) {
        /*
         * instanceof 比较操作符，用于判断对象的运行类型是否为XX类型或XX类型的子类型，如果为是则返回true，不是则返回false
         * 注意是运行类型，不是编译类型，相当于判断这个变量指向的对象的对象类型，不是这个变量的类型
         * */
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        AA aa = new BB();//aa这个变量的变量类型是AA，aa指向的对象的类型是BB
        System.out.println(aa instanceof BB);//true
        // 结果为true，说明aa的类型是BB，已知aa的运行类型是BB，可知instanceof判断的是变量的运行类型，也就是变量指向的对象的类型
        System.out.println(aa instanceof AA);//true

        Object object = new Object();
        System.out.println(object instanceof AA);//fasle
        //object的运行类型是Object，Object类型不是AA类型或AA的子类型，是AA的父类型，故返回false
        String str = "4564";
        System.out.println(str instanceof  Object);//true


    }
}

class AA {

}

class BB extends AA {

}