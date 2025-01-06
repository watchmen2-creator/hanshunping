package chapter08.com.hspedu.Object_;

public class HashCode_ {
    public static void main(String[] args) {
        /*
         * （1）提高具有哈希结构的容器的效率
         * （2）两个引用，如果指向的是同一个对象，则哈希值肯定是一样的
         * （3）两个引用，如果指向的是不同对象，则哈希值肯定是不一样的
         * （4）哈希值主要是根据内存地址号来的，但是不能完全将哈希值等价于地址
         * 后面在集合中hashCode如果需要的话，也会重写
         * */
        AA a = new AA();
        AA b = new AA();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        AA c = a;
        System.out.println(c.hashCode());
    }
}

class AA {

}

class BB extends A {
}