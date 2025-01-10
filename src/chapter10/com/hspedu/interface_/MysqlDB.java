package chapter10.com.hspedu.interface_;

public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database");
    }

    @Override
    public void close() {
        System.out.println("Closing MySQL database connection");
    }
}
