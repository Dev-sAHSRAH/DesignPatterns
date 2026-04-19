public class DBConnection {
    private String userName;
    private String url;

//    Expensive Constructor
    public DBConnection(String userName, String url) {
        System.out.println("🔥 Expensive DB setup happening...");
        this.userName = userName;
        this.url = url;
    }

//    Private constructor used ONLY for cloning
    private DBConnection(){}

//    Prototype method
    public DBConnection copy(){
        DBConnection copy = new DBConnection();
        copy.userName = this.userName;
        copy.url = this.url;
        return copy;
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "url='" + url + '\'' +
                ", username='" + userName + '\'' +
                '}';
    }

}
