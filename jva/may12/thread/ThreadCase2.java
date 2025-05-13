package jva.may12.thread;
// running one task with multiple thread
public class ThreadCase2 extends Thread{

    @Override
    public void run() {
        System.out.println("Single Task : Running "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadCase2 t1 = new ThreadCase2();
        t1.start();
        ThreadCase2 t2 = new ThreadCase2();
        t2.start();
        ThreadCase2 t3 = new ThreadCase2();
        t3.start();
    }
}
