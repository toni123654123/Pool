import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool("","","");
        Connection con = pool.checkOut();
        pool.checkIn(con);
    }
}
