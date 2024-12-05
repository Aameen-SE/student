package exceptnhandling;

public class CheckedException {
    public static void main(String[] args) {

        // handled exceptin
       try{
           method();
           Thread.sleep(2000);
       } catch (Exception e){
           e.printStackTrace();
       }

    }
    // uhnhandled exception
    public static void method()throws InterruptedException{
        Thread.sleep(2000);
    }
}
