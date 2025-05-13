package jva.may12.thread;
// case1 : erforming single task from single thread

public class ThreadCase1  extends Thread{
    @Override
    public void run() {
        System.out.println("Single task is running ");
    }

    public static void main(String[] args) {
        ThreadCase1 threadCase1 = new ThreadCase1();
        threadCase1.start();
    }
}
