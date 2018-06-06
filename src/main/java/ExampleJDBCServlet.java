import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class ExampleJDBCServlet {
    public static void main(String[] args) throws SQLException {


        DriverManager.registerDriver(new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        });

//     Config config = new Config();

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                "root", //username,
                "password" //password
        );


        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM employees where birth-date LIKE %12-25";

        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("first_name"));
        }

    }
}

// IN A NEW CLASS CONFIG

// public class Config{
// private String username = "username";
//private String password = "password";

