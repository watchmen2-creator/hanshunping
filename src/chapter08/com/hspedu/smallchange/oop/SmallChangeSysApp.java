package chapter08.com.hspedu.smallchange.oop;
/*
* 这里直接调用SmallChangeSysOOP的对象显示主菜单即可
* */
public class SmallChangeSysApp {
    public static void main(String[] args) {
        System.out.println("the logo of SmallChangeSysApp");
        SmallChangeSysOOP smallChangeSysOOP = new SmallChangeSysOOP();
        smallChangeSysOOP.mainMenu();
    }
}
