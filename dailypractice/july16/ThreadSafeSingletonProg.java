package dailypractice.july16;
//Create a singleton class Logger that:
//
//Must be thread-safe.
//
//Has a method log(String message) that prints: Log: <message>.
//
//Create two threads in main() which both try to get the logger instance and log messages.



class Logger{
     static Logger logger ;

    private Logger(){}

    public static synchronized Logger getInstance() {

        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
    public void log(String message){
        System.out.println(message);;
    }
}
public class ThreadSafeSingletonProg {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log = Logger.getInstance();
                log.log("Logger 1 is online ");

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log2 = Logger.getInstance();
                log2.log("Logger 2 is online ");
            }
        });

        t1.start();
        t2.start();
    }
}
