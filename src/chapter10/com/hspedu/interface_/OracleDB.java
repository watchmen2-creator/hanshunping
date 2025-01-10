package chapter10.com.hspedu.interface_;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle Database");
    }

    @Override
    public void close() {
        System.out.println("Connection to Oracle Database closed");
    }
}
