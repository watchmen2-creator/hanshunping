package chapter08.com.hspedu.extend_;

//Ctrl + h 可以看到类的继承关系
//Object这个类是所有类的基类、父类
public class Sub extends Base {
    public Sub() {
        super(2);//默认调用父类的无参构造器，写和不写是一样的
        /*
         * 当创建子类对象时，不管使用子类的哪个构造器，默认情况总会去调用父类的无参构造器
         * 如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器去完成对父类的初始化工作，否则编辑会不通过
         * 可以指定使用父类的哪个构造器（如果父类中有多个构造器的话），用super即可，默认是调用super()，父类的无参构造器；
         * 指定用父类的某个有参构造器就在super中传参数即可，例如super(n1,n2)
         * super父类构造器只能放在构造器第一行，因为一个子类的构造器中，调用自己的其他构造器this()和使用父类的构造器super()只能用其中一个
         * super父类构造器只能在构造器中使用，不能在普通的方法中使用
         * 父类构造器的调用不限于直接父类，将一直向上追溯到Object类（顶级父类）
         * 子类最多只能继承一个父类（指直接继承），即java中是单继承机制
         * 不能滥用继承，子类和父类之间必须满足is-a的逻辑关系
         * */
        System.out.println("Sub()....");
    }

    public Sub(int a) {
        super(5, 6);
        System.out.println("Sub(int)....");
    }

    public void sayOk() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
//        System.out.println(n4);
        System.out.println(getN4());
        test100();
        test200();
        test300();
//        test400();
        calltest400();
    }
}
