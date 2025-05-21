package jva.may21;
//Create a Java program where a thread prints a countdown from 10 to 1, with a delay of 1 second between each number.
class CountDownThread implements Runnable{

    @Override
    public void run() {
        for(int i =10;i>=1;i--){
            System.out.println("CountDown : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){Thread.currentThread().interrupt();}
        }
    }
}
public class ThreadCountdown {
    public static void main(String[] args) {
    Thread thread = new Thread(new CountDownThread());
    thread.start();
    }
}
