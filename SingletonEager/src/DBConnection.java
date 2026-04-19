public class DBConnection {
    private static DBConnection obj = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return obj;
    }
}
