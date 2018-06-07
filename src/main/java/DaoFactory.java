import java.sql.SQLException;
import java.util.List;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

//    public static void main(String[] args) {
//
//    }


}
// call the all ()