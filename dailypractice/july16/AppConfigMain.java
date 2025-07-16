package dailypractice.july16;

//Create a singleton class called AppConfig that:
//
//Should allow only one instance throughout the application.
//
//Has a method getAppName() that returns "My Awesome App".
//
//Test it in a main() method by getting its instance and calling getAppName().
class AppConfig{

    private static  AppConfig appConfig = new AppConfig();

    private AppConfig(){}

    public static AppConfig getInstance(){
        return appConfig;
    }
    public String getName(){
        return "My Awesome App";
    }
}
public class AppConfigMain {

    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();
        System.out.println(config.getName());
    }

}
