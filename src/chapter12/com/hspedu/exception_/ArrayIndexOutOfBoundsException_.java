package chapter12.com.hspedu.exception_;

public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i <= 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[-6]);
    }
}
