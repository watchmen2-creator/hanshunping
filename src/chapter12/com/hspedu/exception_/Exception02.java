package chapter12.com.hspedu.exception_;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) {
//        Throwable

        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
