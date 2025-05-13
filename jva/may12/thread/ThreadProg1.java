package jva.may12.thread;
class TestThread extends Thread{
    public void run(){
        System.out.println("TestThread is running ... ");
    }
}
public class ThreadProg1 extends Thread{
    public void run(){
        System.out.println("Thread Run method.... ");
    }
    public static void main(String[] args) {
        ThreadProg1 threadProg1 = new ThreadProg1();
        threadProg1.start();

        TestThread testThread = new TestThread();
        testThread.start();
    }
}
