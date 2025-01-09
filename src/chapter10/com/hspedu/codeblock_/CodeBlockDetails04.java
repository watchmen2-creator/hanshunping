package chapter10.com.hspedu.codeblock_;

public class CodeBlockDetails04 {
    public static void main(String[] args) {
        /*
         * 先进行类的加载，再进行对象创建
         * 进行类加载的时候，就调用静态代码块；进行对象创建的时候就调用构造器，在构造器里面第一句第二句有默认的先调用super方法，父类构造器，然后调用普通代码块
         *
         * 然后继承的父子类，在进行类加载，调用静态代码块的时候，先判断父类的静态代码块是否执行过，如果没有执行的话就先执行父类的静态代码块，
         * 在执行父类的静态代码块时，也需要先判断父类的父类的静态代码块是否执行过，如果没有执行就先执行父类的父类的静态代码块，一直追到Object类，
         * 然后从Object基类的静态代码块，到各个父类的静态代码，再到本类的静态代码块，如果没有执行过就执行一下，如果执行了就往下执行，因为静态代码块只调用一次
         * 各级类的静态代码块补足执行后，然后执行本类的构造器。
         *
         * 在本类的构造器中，先调用本类的super方法，再调用本类的普通代码块，最后调用构造器里面的代码
         * 其中调用super时，就跑到了父类的构造器，父类的构造器同样也是先调用“本类”的super方法，再调用“本类”的普通代码块
         * 然后就这样又一直追到Object类，从Object基类的普通代码块、构造器，到各个父类的普通代码块、构造器，一直执行到本类的普通代码块、构造器
         *
         * */
        CCCC cccc = new CCCC();
        //(1)AAAA 的静态代码块
        //（2）BBBB 的静态代码块
        //（3）CCCC 的静态代码块
        //(4)AAAA 的普通代码块
        //（5）AAAA的构造器
        //(6)BBBB 的普通代码块
        //（7）BBBB的构造器
        //(8)CCCC 的普通代码块
        //（9）CCCC的构造器



        /*
         * 静态代码块只能直接静态成员（静态属性、静态方法）
         * 普通代码块可以调用任何成员（实例属性、实例方法、静态属性、静态方法）
         * 构造器可以调用任何成员（实例属性、实例方法、静态属性、静态方法）
         * 父类构造器只能调用父类的成员（实例属性、实例方法、静态属性、静态方法）
         * 子类构造器可以调用父类的成员（实例属性、实例方法、静态属性、静态方法）
         * */
    }
}

class AAAA {
    //静态代码块
    static {
        System.out.println("AAAA 的静态代码块");
    }

    //静态属性
    static int a = 10;

    //普通代码块
    {
        System.out.println("AAAA 的普通代码块");
    }

    //普通属性
    private int b = 20;

    //构造器
    public AAAA() {
        //super();
        //AAAA的普通代码块
        System.out.println("AAAA 的构造器");
    }

}

class BBBB extends AAAA {
    //静态代码块
    static {
        System.out.println("BBBB 的静态代码块");
    }

    //静态属性
    static int c = 30;

    //普通代码块
    {
        System.out.println("BBBB 的普通代码块");
    }

    //普通属性
    private int d = 40;

    //构造器
    public BBBB() {
        System.out.println("BBBB 的构造器");
    }
}

class CCCC extends BBBB {
    //静态代码块
    static {
        System.out.println("CCCC 的静态代码块");
    }

    //静态属性
    static int e = 50;

    //普通代码块
    {
        System.out.println("CCCC 的普通代码块");
    }

    //普通属性
    private int f = 60;

    //构造器
    public CCCC() {
        System.out.println("CCCC 的构造器");
    }

}