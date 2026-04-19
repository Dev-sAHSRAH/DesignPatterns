public class DBConnection {
    private static DBConnection obj;

    private DBConnection() {
    }

    public static DBConnection getInstance(){
        if(obj == null){
            obj = new DBConnection();
        }
        return obj;
    }

}
