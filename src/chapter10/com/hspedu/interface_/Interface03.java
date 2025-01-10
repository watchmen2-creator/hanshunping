package chapter10.com.hspedu.interface_;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        test(mysqlDB);

        OracleDB oracleDB = new OracleDB();
        test(oracleDB);
    }

    public static void test(DBInterface db) {
        db.connect();
        db.close();
    }
}
