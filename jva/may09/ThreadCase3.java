package jva.may09;

class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("TestThread is running");
    }
}

class TestThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("TestThread2 is running");
    }
}
// multiple task with multiple thread
public class ThreadCase3 {

    public static void main(String[] args) {
       TestThread2 testThread2 = new TestThread2();
       testThread2.start();
       TestThread testThread = new TestThread();
        testThread.start();
    }
}
