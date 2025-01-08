package chapter10.com.hspedu.codeblock_;

public class CodeBlockDetails01 {
    /*
     * static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行
     * 并且只会执行一次。如果是普通代码块，没创建一个对象就会执行一次
     * 静态代码块只会被执行一次，是因为类只会被加载一次
     * 普通代码块只在被创建对象时被调用，跟类加载没有关系
     *
     * 类什么时候会被加载
     * 创建对象实例时
     * 创建子类对象实例时，父类也会被加载
     * 使用类的静态成员时（静态变量、静态方法）
     *
     * 普通的代码块，在创建对象实例时，会被隐式调用，而静态代码块则需要显式调用
     * 普通代码块，对象被创建一次就会被调用一次
     * 静态代码块，类被加载时就会被调用一次
     * 如果只是使用类的静态成员时，普通代码快不会被执行
     * */
    public static void main(String[] args) {
        AA a = new AA();//注释不注释都一样，静态代码块就调用一次
        BB b = new BB();
        System.out.println(CC.fun());
        DD d = new DD();
        DD dd = new DD();
    }

}

class DD {
    //DD 的静态代码块
    static {
        System.out.println("DD static block");
    }

    //DD 的普通代码块
    {
        System.out.println("DD normal block");
    }
}

class CC {
    private static int i = 10;

    public static int fun() {
        return i;
    }

    //CC 的静态代码块
    static {
        System.out.println("CC static block");
    }
}

class AA {
    //AA 的静态代码块
    static {
        System.out.println("AA static block");
    }

}

class BB extends AA {
    //BB 的静态代码块
    static {
        System.out.println("BB static block");
    }
}