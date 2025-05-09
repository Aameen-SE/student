package jva.may09;

public class ThreadCase2 extends Thread{
    public void run(){
        System.out.println("Thread is running ");
    }

    public static void main(String[] args) {
        ThreadCase2 tr12 = new ThreadCase2();
        tr12.start();
        ThreadCase2 tr31 = new ThreadCase2();
        tr31.start();
    }
}
