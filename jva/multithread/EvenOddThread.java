package jva.multithread;
class OddThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i+": OddThread");
                }
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i+": EvenThread");
                }
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class EvenOddThread {
    public static void main(String[] args) {
       // OddThread oddThread= new OddThread();
        //oddThread.start();
        new OddThread().start();

        EvenThread evenThread = new EvenThread();
        evenThread.start();

    }
}
