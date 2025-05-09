package jva.may09;

public class Test extends Thread{

    @Override
    public void run() {
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test tr1 = new Test();
        tr1.start();
    }
}
