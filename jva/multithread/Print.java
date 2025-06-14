package jva.multithread;
class AThread extends Thread{
    @Override
    public void run() {
        System.out.println("A......");
    }
}

class BThread extends Thread{
    @Override
    public void run() {
        System.out.println("B......");
    }
}

class CThread extends Thread{
    @Override
    public void run() {
        System.out.println("C......");
    }
}

//Create 3 threads – one prints "A", another "B", and another "C" – and run them in sequence using join().

public class Print {

    public static void main(String[] args) {

        AThread t1 = new AThread();
        BThread t2 = new BThread();
        CThread t3 = new CThread();

        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (Exception e){
            System.out.println("Thread Interrupted");
        }
    }
}
