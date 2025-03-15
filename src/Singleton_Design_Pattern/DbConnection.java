package Singleton_Design_Pattern;

public class DbConnection {
    private static DbConnection instance;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/";

    private DbConnection() {

    }

   public static DbConnection getInstance() {
        if (instance == null) {
            synchronized (DbConnection.class) {
                if (instance == null) {
                    instance = new DbConnection();
                }
            }
        }
        return instance;
   }

   public static String getConnectionInfo() {
        return "Connection Url: "+url+ "\nConnection driver: "+ driver;
   }
}
