package chapter10.com.hspedu.main_;

public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        /*
        * 在idea里面运行的时候，可以通过编辑器右侧的运行按钮，edit configurations，然后选择运行的类，在program arguments中输入参数。
        * 运行后，控制台会输出args数组中每个元素的值。
        * */
    }
}
