import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new IllegalStateException("Oh! Something went wrong!", e);
        }



    }
    @Override
    public List<Ad> all() throws SQLException {

        List<Ad> ads = new ArrayList<>();
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM ads LIMIT 5";

        ResultSet rs = stmt.executeQuery(query);


        // iterate across the resultSet
        while(rs.next()) {
            ads.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            ));
            System.out.println(rs.getString("title"));

        }
      return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String values = String.format("'%2d, '%s', '%s'",
                ad.getUserId(), ad.getTitle(), ad.getDescription());

        String query = "INSERT INTO ads(user_id, title, description)"
+ "VALUES(" + values + ad.getUserId() + ad.getTitle() + ad.getDescription() + ")";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if(rs.next()){
            return rs.getLong(1);
        }
        return null;
    }
}
