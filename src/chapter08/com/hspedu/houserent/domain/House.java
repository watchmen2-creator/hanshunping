package chapter08.com.hspedu.houserent.domain;

/*
 *  House 的一个对象表示一个房屋信息
 * */
public class House {
    //编号、房主、电话、地址、月租、状态（未出租/已出租）
    private int id;//编号
    private String name;//房主
    private String phone;//电话
    private String address;//地址
    private double rent;//月租
    private String state;//状态

    //无参构造起，给房屋一个默认值
    public House() {
        this.setId(-1);//id ： -1 表示未定义的默认的房屋
        this.setName("不知名房主");//不知名房主 表示未定义房屋的默认的房主信息
        this.setPhone("00000000000");//00000000000 表示未定义房屋的默认的电话
        this.setAddress("未定义");//未定义 ：表示未定义房屋的默认地址
        this.setRent(99999.99);//99999.99 ： 表示未定义房屋的默认月租
        this.setState("未出租");//未定义房屋的默认状态为：未出租
    }

    public House(int id, String name, String phone, String address, double rent, String state) {
        this.setId(id);
        this.setName(name);
        this.setPhone(phone);
        this.setAddress(address);
        this.setRent(rent);
        this.setState(state);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //重写toString方法，输出房屋信息
    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", rent=" + rent +
                ", state='" + state + '\'' +
                '}';
    }

    /*
     * 按照要求的房屋信息输出格式，写个printInfo方法
     * 编号 房主 电话 地址 月租 状态
     * */
    public String printInfo() {
        // 编号 房主 电话 地址 月租 状态
        return id + "\t\t" + name + "\t\t" + phone + "\t\t" + address + "\t\t" + rent + "\t\t" + state;
    }
}
