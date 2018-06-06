import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class AdlisterServlet {

    public static void main(String[] args) throws SQLException {
      try {
          DriverManager.registerDriver(new Driver());
          Connection connection = DriverManager.getConnection(
                  "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC",
                  "username",
                  "password"
          );

          Statement stmt = connection.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM adlister_db LIMIT 5");

          while (rs.next()) {
              int id = rs.getInt("id");
              String username = rs.getString("username");
              String title = rs.getString("title");
              String description = rs.getString("description");


              System.out.println("id: " + id);
              System.out.println("username " + username);
              System.out.println("title " + title);
              System.out.println("description " + description);


              String SQL = "INSERT INTO users (id, username, email, password)" +
                      "VALUES(?, ?, ?, ?, ?)";
              PreparedStatement pstmt = connection.prepareStatement(SQL);
              connection.setAutoCommit(false);

              pstmt.setInt(1,25);
              pstmt.setString(2,"Kelly");
              pstmt.setString(3, "kelly@email.com");
              pstmt.setString(4, "mypassword");

              pstmt.addBatch();

              int[]count = stmt.executeBatch();

              connection.commit();

          }

          rs.close();
          stmt.close();
          connection.close();

      }catch (SQLException e){
          e.printStackTrace();
      }
    }
}
