package jva.may21;
// 2 thread printing 5 time with 0.5 sec delay

class NewThread implements Runnable
{
    private String msg;
   public  NewThread(String msg){
        this.msg=msg;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(msg+" --"+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class ThreadPrint {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NewThread("Thread 1 "));
        Thread thread2 = new Thread(new NewThread("Thread2"));
        thread1.start();
        thread2.start();
    }
}
