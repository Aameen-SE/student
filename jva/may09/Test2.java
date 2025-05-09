package jva.may09;

public class Test2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running by implementing with Runnable");
    }

    public static void main(String[] args) {
        Test2 tr2 = new Test2();
        Thread thread1 = new Thread(tr2);
        thread1.start();
    }
}
