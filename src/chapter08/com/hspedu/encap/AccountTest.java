package chapter08.com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("韩顺平45",15,"1447852");
        System.out.println(account.getInfo());
        Account account1 = new Account();
        account1.setName("张楚岚");
        account1.setBalance(60);
        account1.setPassword("654123");
        System.out.println(account1.getInfo());
    }
}
