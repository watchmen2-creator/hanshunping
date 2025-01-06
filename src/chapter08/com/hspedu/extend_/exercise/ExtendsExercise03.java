package chapter08.com.hspedu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("i7", 16, 1000, "HP");
        NotePad notePad = new NotePad("i5", 8, 500, "White");

        System.out.println(laptop.getDetails());
        System.out.println(notePad.getDetails());

        Laptop laptop2 = new Laptop();
        NotePad notePad2 = new NotePad();

        System.out.println(laptop2.getDetails());
        System.out.println(notePad2.getDetails());
    }
}

class Computer {
    private String cpu;
    private int ram;
    private double hardDisk;

    public Computer() {
        cpu = "CPU";
        ram = 8;
        hardDisk = 500;
    }

    public Computer(String cpu, int ram, double hardDisk) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    //返回所有属性
    public String getDetails() {
        return "CPU: " + cpu + " RAM: " + ram + " Hard Disk: " + hardDisk;
    }
}

class Laptop extends Computer {
    public String brand;

    public Laptop() {
        super();
        brand = "HP";
    }

    public Laptop(String cpu, int ram, double hardDisk, String brand) {
        super(cpu, ram, hardDisk);
        this.brand = brand;
    }

    public String getDetails() {
        return super.getDetails() + " Brand: " + brand;
    }
}

class NotePad extends Computer {
    public String color;

    public NotePad() {
        super();
        color = "Black";
    }

    public NotePad(String cpu, int ram, double hardDisk, String color) {
        super(cpu, ram, hardDisk);
        this.color = color;
    }

    public String getDetails() {
        return super.getDetails() + " Color: " + color;
    }

}