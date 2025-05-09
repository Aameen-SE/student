package jva.may09;

public class ThreadCase1 extends Thread{
    // single task from single thread

    @Override
    public void run() {
        System.out.println("Thread is running ");
    }

    public static void main(String[] args) {
        ThreadCase1 tr11 = new ThreadCase1();
        tr11.start();
    }
}
