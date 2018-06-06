public class Config{


    private String user;
    private String password;
    private String url;

    public String getUrl() {
        url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
        return url;
    }

    public String getUser() {
    user = "root";
        return user;
    }

    public String getPassword() {
        password = "codeup";
        return password;
    }







}
