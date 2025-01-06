package chapter08.com.hspedu.homework;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("balce", 199.2, 65.32);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}