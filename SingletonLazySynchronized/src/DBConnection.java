public class DBConnection {
    private static DBConnection obj;

    private DBConnection(){
    }

    synchronized public static DBConnection getInstance(){
        if(obj == null){
            obj = new DBConnection();
        }
        return obj;
    }
}
