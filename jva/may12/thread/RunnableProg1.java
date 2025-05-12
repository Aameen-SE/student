package jva.may12.thread;

public class RunnableProg1 implements Runnable {
    public void run(){
        System.out.println("Running .....");
    }
    // as we have implemented runnable and then we have created thread and pass the ibject reference and then we have start the thread
    public static void main(String[] args) {
        RunnableProg1 runnableProg1 = new RunnableProg1();
        Thread thread = new Thread(runnableProg1);
        thread.start();
    }
}
