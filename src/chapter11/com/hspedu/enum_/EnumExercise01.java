package chapter11.com.hspedu.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
//        Enum
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);
        System.out.println(boy == boy2);//true
    }
}

enum Gender {
    BOY, GIRL;
    private String description;


}