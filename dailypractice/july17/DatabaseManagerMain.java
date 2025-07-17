package dailypractice.july17;
//Design a class DatabaseManager using the Singleton pattern that:
//
//Allows only one instance of the class across the application
//
//Has a method connect() that prints "Connected to the database"
//
//Has a method disconnect() that prints "Disconnected from the database"
//
//Ensures the singleton instance is thread-safe using synchronized block or holder class

class DBManager{
    private static DBManager dbManager;

    private DBManager(){}

    public static DBManager getDbManager() {
        if(dbManager==null){
            return new DBManager();
        }
        return dbManager;
    }

    public void connect(){
        System.out.println("Database is connected ");
    }
    public void disconnect(){
        System.out.println("Database is connected ");
    }
}
public class DatabaseManagerMain {

    public static void main(String[] args) {
      DBManager dbManager1 = DBManager.getDbManager();
      dbManager1.connect();
      DBManager dbManager2 = DBManager.getDbManager();
      dbManager2.connect();

      DBManager disconnectManger = DBManager.getDbManager();
      disconnectManger.disconnect();

    }
}
