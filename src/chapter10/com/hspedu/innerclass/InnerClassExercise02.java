package chapter10.com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦");
            }
        });
        phone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

}

//接口
interface Bell {
    void ring();
}

//类
class CellPhone {
    public void alarmclock(Bell bell) {//形参是接口类型
        bell.ring();
    }
}