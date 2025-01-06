package chapter08.com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String password;

    //无参构造器
    public Account() {
        this.setName("");
        this.setBalance(20.1);
        this.setPassword("123456");
    }
    //全参构造器
    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }
    public String getInfo(){
        return "Name: " + this.getName() + ", Balance: " + this.getBalance() + ", Password: " + this.getPassword();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name 长度不在2~4之间，给一个默认值：tom");
            this.name = "tom";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，现在给了默认值：20");
            this.balance = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码长度不是6位，给一个默认密码：123456");
            this.password = "123456";
        }
    }
}
