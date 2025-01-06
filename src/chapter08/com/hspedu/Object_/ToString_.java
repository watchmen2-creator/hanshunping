package chapter08.com.hspedu.Object_;

public class ToString_ {
    public static void main(String[] args) {
        /*
         * 默认返回：全类名+@+哈希值的十六进制
         * 子类往往重写toString方法，用于返回对象的属性信息
         * Object的toString方法
         * public String toString() {
         *   return getClass().getName() + "@" + Integer.toHexString(hashCode());
         * }
         * 当直接输出一个对象时，toString方法会默认被调用
         * */
        Monster monster = new Monster();
        System.out.println(monster.toString());
        System.out.println(monster.hashCode());
        System.out.println(monster);//直接输出一个对象时，toString方法会默认被调用
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster() {
        this.setName("Tom");
        this.setJob("coding");
        this.setSal(28000.96);
    }

    public Monster(String name, String job, double sal) {
        this.setName(name);
        this.setJob(job);
        this.setSal(sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    /*
    * 重写toString方法
    * 使用快捷键：Alt + Insert -> toString
    * */
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}