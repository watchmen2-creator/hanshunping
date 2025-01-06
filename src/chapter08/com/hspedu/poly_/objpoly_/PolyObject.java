package chapter08.com.hspedu.poly_.objpoly_;


/*
 *（1）一个对象的编译类型和运行类型可以不一致
 *（2）编译类型在定义对象时，就确定了，不能改变
 *（3）运行类型是可以变化的
 *（4）编译类型看定义时 =号 的左边，运行类型看 =号的 右边
 * */
public class PolyObject {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.cry();
        animal = new Dog("Dog");
        animal.cry();
        animal = new Cat("Cat");
        animal.cry();

        //运行类型是可以变化的，编译类型在定义对象时，就确定了，不能改变
        animal = new Dog("Animal");//编译类型是Animal，运行类型是Dog


    }
}
