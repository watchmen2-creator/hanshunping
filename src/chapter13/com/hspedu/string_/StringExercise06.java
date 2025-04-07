package chapter13.com.hspedu.string_;

public class StringExercise06 {
    public static void main(String[] args) {
        //问：以下语句创建了几个对象？
        String s1 = "hello";
        s1 = "haha";
        //答：创建了两个对象（常量池中的对象），一个是"hello"，一个是"haha"。


        //问：以下语句创建了几个对象？
        String s2 = "abc" + "def";
        //答：创建了一个对象（常量池中的对象），是"abcdef"
        //编译器会优化，这条语句等价于：String s2 = "abcdef";不会创建“abc”和“def”两个对象，因为创建了没人用。


        //问：以下语句创建了几个对象？
        String a = "a";
        String b = "b";
        String s3 = a + b;
        //答：a创建一个对象，b创建一个对象,s3没有创建对象
        //自己的理解：a、b是变量，其指向的内容是会变的，编译器对于你这个变量不会根据传进来的数据创建对象
        //如果是String s4 = a+b+"xyz" 这样会创建对象吗
        //老韩解读
        //1. 先 创建一个 StringBuilder sb = StringBuilder()
        //2. 执行  sb.append("a");
        //3. sb.append("b");
        //4. String s3= sb.toString()
        //最后其实是 s3 指向堆中的对象(String) value[] -> 池中 "ab"

        String s4 = "ab";
        System.out.println(s3 == s4);//false
        String s5 = "a" + "b";
        System.out.println(s4 == s5);//true
    }
}
