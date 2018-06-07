import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

        try {
            DriverManager.registerDriver(new Driver());
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
        String query = "SELECT * FROM ads";
        ResultSet rs = stmt.executeQuery(query);


//        // iterate across the resultSet
//        while(rs.next()) {
//            ads.add(new Ad(
//                    rs.getLong("id"),
//                    rs.getLong("user_id"),
//                    rs.getString("title"),
//                    rs.getString("description")
//            ));
//            System.out.println(rs.getString("title"));
//
//            return createAdsFromResults(rs);
//        }
        return createAds(rs);
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
//        String values = String.format("'%2d, '%s', '%s'",
//                ad.getUserId(), ad.getTitle(), ad.getDescription());
//
//        String query = "INSERT INTO ads(user_id, title, description)"
//+ "VALUES(" + values + ")";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(adInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if(rs.next()){
            return rs.getLong(1);
        }
        return null;
    }

    private String adInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAds(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }

}
