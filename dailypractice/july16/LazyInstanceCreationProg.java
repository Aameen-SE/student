package dailypractice.july16;
//Create a singleton class DatabaseConnection that:
//
//Should use lazy initialization, meaning the instance should be created only when it is first requested.
//
//Has a method connect() that prints: "Database connected!".
//
//Test it by calling connect() from main().

class DatabaseConnection{
    static DatabaseConnection dbConnect ;

    private DatabaseConnection(){}

    static DatabaseConnection getInstance(){
        if(dbConnect==null){
            return new DatabaseConnection();
        }
        return dbConnect;
    }

    public void connect(){
        System.out.println("Database connected ");
    }
}
public class LazyInstanceCreationProg {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.connect();
    }
}
