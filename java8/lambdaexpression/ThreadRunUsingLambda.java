package java8.lambdaexpression;

public class ThreadRunUsingLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Thread is running using lambda"));
        thread.start();
    }
}
