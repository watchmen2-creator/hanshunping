package chapter10.com.hspedu.innerclass;

public class MemberInnerClass01 {
    /*
     * 成员内部类：
     * 是定义在外部类的成员位置，并且没有static修饰
     * 1.可以直接访问外部类的所有成员，包含私有的
     * 2.可以添加任意访问修饰符（public、protected、默认、private），因为它的地位就是一个成员
     * 3.作用域：和外部类的其他成员一样，为整个类体
     * 4.成员内部类---访问--->外部类（比如：属性 ） [访问方式：直接访问]
     * 5.外部类---访问--->成员内部类（比如：方法） [访问方式：创建对象再访问]
     * 6.外部其他类---访问--->成员内部类 [访问方式：1、先创建外部类对象，再使用相应语法创建成员内部类的对象；2、直接使用相应语法创建成员内部类的对象；3、在外部类中编写一个方法，返回成员内部类的对象]
     * 7.如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员名）去访问
     * */
    public static void main(String[] args) {
        //1、先创建外部类对象，再使用相应语法创建成员内部类的对象
        Outer08 obj1 = new Outer08();
        Outer08.Inner08 obj2 = obj1.new Inner08();
        //2、直接使用相应语法创建成员内部类的对象
        Outer08.Inner08 obj = new Outer08().new Inner08();
        //3、在外部类中编写一个方法，返回成员内部类的对象
        Outer08.Inner08 obj3 = obj1.getInner08();

        obj3.say();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "Tom";

    class Inner08 {
        public int n1 = 20;

        public void say() {
            System.out.println("n1 = " + n1 + ",name = " + name + ",outer08.n1 = " + Outer08.this.n1);
        }
    }

    //怎么用这个成员内部类呢？
    public void test() {
        //创建成员内部类的对象
        Inner08 obj = new Inner08();
        obj.say();
    }

    //方法，返回一个成员内部类的对象
    public Inner08 getInner08() {
        return new Inner08();
    }
}