package chapter12.com.hspedu.try_;

public class TryCatchExercise03 {
}

class ExceptionExe01 {
    public static int method() {
        int i = 1;//i = 1
        try {
            i++;// i=2
            String[] names = new String[3];
            if (names[1].equals("tom")) { //空指针
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;  // i = 3 => 保存临时变量 temp = 3;去执行完finally块后再返回临时变量 temp = 3;
        } finally {
            ++i; //i = 4
            System.out.println("i=" + i);// i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());// 3
    }
}