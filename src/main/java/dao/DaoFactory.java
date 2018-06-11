package dao;

import models.User;

import java.sql.SQLException;

//public class DaoFactory {
//    private static Ads adsDao;
//    private static Users adsUsersDao;
//    private static Config config = new Config();
//    private static User user = new User();
//
//
//    public static Ads getAdsDao() throws SQLException {
//        if (adsDao == null) {
//            adsDao = new MySQLAdsDao(config);
//        }
//        return adsDao;
//    }
//
//    public static Users getUsersDao() {
//        if(adsUsersDao == null){
//            adsUsersDao = new MySQLUsersDao(config);
//        }
//        return adsUsersDao;
//    }
//}

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() throws SQLException{
        if (adsDao == null){
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao(){
        if(usersDao == null){
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

}