package dzien5.baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static Connection connection;

    private Connector() {
    }

    public static Connection getConnection() {
        if(connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userName = "hr";
        String password = "hr";

        try {
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
            return null;
        }
    }
}
