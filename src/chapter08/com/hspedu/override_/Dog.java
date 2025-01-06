package chapter08.com.hspedu.override_;

/*
 * 方法重写的注意事项和使用细节
 * （1）子类方法的参数、方法名称、要和父类方法的参数、名称完全一致
 * （2）子类方法的返回类型要和父类方法的返回类型一样，或者是父类返回类型的子类
 * 例如：父类返回的是Object类型，子类可以是Object类型，也可以是Object类型的子类，如：String类型
 * 又例：父类返回的是Animal类型，子类可以是Animal类型，也可以是Animal类型的子类，如：Dog类型
 * （3）子类方法不能缩小父类方法的访问权限
 * public > protected > 默认 > private
 * */
public class Dog extends Animal {
    /*
     * 因为Dog是Animal的子类，cry方法的名称、参数、返回类型都一样，这时就构成重新父类方法了
     * */
    public void cry() {
        System.out.printf("小狗汪汪叫");
    }

//    public Object m1() {
//        return null;
//    }

    public String m1() {
        return null;
    }

//    private void eat() {
//
//    }

    public void eat() {

    }
}
