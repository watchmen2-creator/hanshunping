package chapter08.com.hspedu.Object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 18, "man");
        Person p2 = new Person("Tom", 18, "man");
        System.out.println("p1 == p2 : " + (p1 == p2)); // ==比较的是内存地址，对象不同，地址不同，所以false
        p1.printInfo();
        p2.printInfo();
        System.out.println("p1.equals(p2) : " + p1.equals(p2)); // 如果Person类没有重写equals方法，则调用Object的equals方法进行比较，Object的equals方法比较的是内存地址，所以false
        System.out.println("p1.equals(p2) : " + p1.equals(p2)); // 如果Person类重写了equals方法，则调用Person的equals方法进行比较，Person的equals比较的是内容，内容相同，所以true
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
//        this.setName("Tom");
        this.setAge(18);
        this.setGender("man");
    }

    public Person(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //一行打印信息
    public void printInfo() {
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() + ", Gender: " + this.getGender());
    }

    @Override
    //重写Object的equals方法，比较对象的内容
    public boolean equals(Object obj) {
        if (this == obj) {//如果内存地址相同，则认为是同一个对象，肯定是true
            return true;
        }
        if(obj instanceof Person) {//如果obj是Person类型或Person类型的子类型的才去比较否则类型不一样肯定不一样，返回false
            Person p = (Person)obj;//从Object类型向下转型到Person类型，如果不向下转型得不到obj的Person类型的属性
            return this.getName().equals(p.getName()) && this.getAge() == p.getAge() && this.getGender().equals(p.getGender());
        }else {
            return false;
        }

//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Person other = (Person) obj;
//        if (!this.getName().equals(other.getName())) {
//            return false;
//        }
//        if (this.getAge() != other.getAge()) {
//            return false;
//        }
//        if (!this.getGender().equals(other.getGender())) {
//            return false;
//        }
//        return true;
    }
}
