package jva.multithread;
class PrintThread implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch (Exception e){}
    }
}
public class PrintThreaadRunnableMain  {
    public static void main(String[] args) {
       Thread thread = new Thread(new PrintThread());
       thread.start();
    }
}
