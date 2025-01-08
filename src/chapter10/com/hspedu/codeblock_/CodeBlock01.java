package chapter10.com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("星球大战");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //代码比较冗余
    //可以把相同的语句放在一个代码块中
    //代码块的嗲用优先于构造器
    {
        System.out.println("电影屏幕打开");
        System.out.println("播放广告");
        System.out.println("正片开始");
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("播放广告");
//        System.out.println("正片开始");
        System.out.println("构造器执行");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("播放广告");
//        System.out.println("正片开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("播放广告");
//        System.out.println("正片开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}