package jva.multithread;

public class PrintNumber extends Thread{
    //Create a thread that prints numbers from 10 to 1 with a 1-second delay.
    public static void main(String[] args) {

        PrintNumber printNumber = new PrintNumber();
        Thread thread = new Thread(printNumber);
        thread.start();
    }

    @Override
    public void run() {
        try{
        for(int i =10;i>=1;i--){
            System.out.println(i);
            sleep(500);
        }
        } catch (Exception e){e.printStackTrace();}
    }
}
