package chapter10.com.hspedu.innerclass;

public class AnonymousInnerClass {
    /*
     * 匿名内部类：
     * （1）本质是类
     * （2）内部类
     * （3）该类没有名字
     * （4）同时还是一个对象
     * 匿名内部类是定义在外部类的局部位置（方法体、代码块中），并且没有类名
     * 匿名内部类的基本语法：
     * new 父类或接口名(参数列表) {
     *     类体  // 重写父类或接口的方法
     * }
     * */
    public static void main(String[] args) {
        Outer04 outer = new Outer04();
        outer.method();
    }
}

//外部类
class Outer04 {
    //属性
    private int n1 = 10;

    //方法
    public void method() {
        //基于接口的匿名内部类
        //解读
        //1.需求：想使用IA接口,并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.需求是 Tiger/Dog 类只是使用一次，后面再不使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型 ? IA
        //6. tiger的运行类型 ? 就是匿名内部类  Outer04$1
        /*
            我们看底层 会分配 类名 Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1实例，并且把地址
        //   返回给 tiger
        //8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };

        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();

        //演示基于类的匿名内部类
        //分析
        //1. father编译类型 Father
        //2. father运行类型 Outer04$2
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2的对象
        //5. 注意("jack") 参数列表会传递给 构造器
        Father father = new Father("jack") {

            //            @Override
//            public void test() {
//                System.out.println("匿名内部类重写了test方法");
//            }
            //匿名内部类不能重写构造器
//            public Father(String name) {
//                super(name);
//            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

//接口
interface IA {

    public void cry();
}

class Tiger implements IA {

    @Override
    public void cry() {
        System.out.println("老虎叫唤...");
    }
}
//class Dog implements  IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪...");
//    }
//}

//类
class Father {
    //属性
    private String name;//姓名
    private int age;//年龄

    //构造器
    public Father(String name) {
        this.setName(name);
        System.out.println("接收到name=" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //方法
    public void test() {
    }
}

//抽象类
abstract class Animal {
    abstract void eat();
}
