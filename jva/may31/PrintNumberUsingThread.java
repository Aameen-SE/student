package jva.may31;

class EvenThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try{if(i%2==0)
                System.out.println("Even Thread : "+i);
                sleep(500);
            }catch (Exception e){e.printStackTrace();}

        }
    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try{ if(i%2!=0)
                System.out.println("Odd Thread : "+i);
                sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
public class PrintNumberUsingThread {
    public static void main(String[] args) {
    EvenThread evenThread = new EvenThread();
    OddThread oddThread = new OddThread();
    oddThread.start();
    evenThread.start();
    }
}
