package chapter10.com.hspedu.homework;/*
 * @author  SturdyGrass(working)
 * @version 1.0
 * 设置这个代码文件模板的头部信息的路径在这：
 * File -> Settings -> Editor -> File and Code Templates -> Includes -> File Header
 * */

public class Homework08 {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {//可以接受的类型：byte、short、int、long、float、double、char、boolean、String、Enum、Class、Interface、Annotation
            case RED:
                color.show();
                break;
            case BLUE:
                color.show();
                break;
            case BLACK:
                color.show();
                break;
            case YELLOW:
                color.show();
                break;
            case GREEN:
                color.show();
                break;
            default:
                System.out.println("没有这个颜色");
        }
    }
}

interface IColor {
    void show();
}

enum Color implements IColor {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(255, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        setRedValue(redValue);
        setGreenValue(greenValue);
        setBlueValue(blueValue);
    }

    @Override
    public void show() {
        System.out.println("颜色值：" + redValue + " " + greenValue + " " + blueValue);
    }

    public int getRedValue() {
        return redValue;
    }

    public void setRedValue(int redValue) {
        this.redValue = redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public void setBlueValue(int blueValue) {
        this.blueValue = blueValue;
    }
}