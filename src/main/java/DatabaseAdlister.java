import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DatabaseAdlister {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/employees?serverTimezone=UTC",
                "monica",
                "password"
        );

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM adlister_db LIMIT 5");

        while(rs.next()){
            System.out.println("email");
        }


    }
}
