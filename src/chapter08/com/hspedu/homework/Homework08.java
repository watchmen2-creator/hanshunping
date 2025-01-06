package chapter08.com.hspedu.homework;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000.0);
        checkingAccount.deposit(10);//1000 + (10 - 1) = 1009
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(9);//1009 - (9 + 1) = 999
        System.out.println(checkingAccount.getBalance());
        System.out.println("----------------------------------");
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);//
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());



    }

}

class BankAccount {
    private double balance;//余额

    //构造器
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    private double serviceCharge;//服务费、手续费

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        this.setServiceCharge(1.0);//手续费默认是1.0美元
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    //重写存款方法，每次存款需要扣除手续费getServiceCharge()
    @Override
    public void deposit(double amount) {
        super.deposit(amount - getServiceCharge()) ;
//        setBalance(getBalance() + amount - getServiceCharge());
    }

    //重写取款方法，每次取需要扣除手续费getServiceCharge()
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + getServiceCharge()) ;
//        setBalance(getBalance() - amount - getServiceCharge());
    }
}

class SavingsAccount extends CheckingAccount {
    private int monthlyFreeTimes;//定义每月免存款、取款手续费的次数
    private double monthlyInterestRate;//定义月利息的利率

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
//        this.setMonthlyFreeTimes(3);//每月三次
//        this.setMonthlyInterestRate(0.023);//月利息利率为2.3%（0.023）
        this.earnMonthlyInterest();
    }

    public int getMonthlyFreeTimes() {
        return monthlyFreeTimes;
    }

    public void setMonthlyFreeTimes(int monthlyFreeTimes) {
        this.monthlyFreeTimes = monthlyFreeTimes;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    //子类特有方法，调用方法就重置每月的东西，一个给余额加上每月利息，一个是每月的免手续费次数重置
    public void earnMonthlyInterest() {
        setBalance(getBalance() * (1 + getMonthlyInterestRate()));//更新余额，把利息加上，复利计息
        /*
        * 注意，这个方法里面，先更新了余额，后设置的利率，然后在构造器里面直接调用了该方法
        * 这样会巧妙的在创建对象时，调用一下本方法，更新一下利息，但是此时利率还没有赋值，是0，就巧妙避开了刚创建对象就给了一个月利息的问题
        * 然后更新完利息后，给利率赋了值，这样相当于本方法里面给利率赋的值是下个月的利率，逻辑正合适
        * */

        setMonthlyFreeTimes(3);//免手续费次数回复到三次
        setMonthlyInterestRate(0.023);//月利息利率为2.3%（0.023）
    }

    //重写存款方法，如果免手续费次数大于零，就不用手续费，如果次数等于等，就还是需要手续费
    @Override
    public void deposit(double amount) {
        if (getMonthlyFreeTimes() > 0) {//如果有免手续费次数，就不用扣手续费，然后次数减一
            setBalance(getBalance() + amount);
            setMonthlyFreeTimes(getMonthlyFreeTimes() - 1);
            return;
        }
        super.deposit(amount);
    }

    //重写取款方法，如果免手续费次数大于零，就不用手续费，如果次数等于等，就还是需要手续费
    @Override
    public void withdraw(double amount) {
        if (getMonthlyFreeTimes() > 0) {//如果有免手续费次数，就不用扣手续费，然后次数减一
            setBalance(getBalance() - amount);
            setMonthlyFreeTimes(getMonthlyFreeTimes() - 1);
            return;
        }
        super.withdraw(amount);
    }
}
