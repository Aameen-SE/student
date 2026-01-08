package designpattern;

class Singleton {

    private static Singleton singletonInstance = null;

    private Singleton(){}

    public static synchronized Singleton getSingletonInstance(){
        if (singletonInstance==null){
             singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonInstance();
    }
}
