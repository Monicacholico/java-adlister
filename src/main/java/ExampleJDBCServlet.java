import java.sql.*;

public class ExampleJDBCServlet {
    public static void main(String[] args) throws SQLException {


//

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
//private String url = "url";

