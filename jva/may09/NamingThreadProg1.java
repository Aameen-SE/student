package jva.may09;

public class NamingThreadProg1  extends  Thread{
    @Override
    public void run() {
        System.out.println("Run Thread : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // getting the current thread
        System.out.println("Current Thread Name : "+Thread.currentThread().getName());
        // seting the thread name to Aameen
        Thread.currentThread().setName("Aameen");
        System.out.println("Current Thread Name : "+Thread.currentThread().getName());
        NamingThreadProg1 named = new NamingThreadProg1();
        named.start();
        System.out.println("Is Alive CurrentThread : "+Thread.currentThread().isAlive());
    }
}
