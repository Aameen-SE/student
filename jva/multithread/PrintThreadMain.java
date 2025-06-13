package jva.multithread;

// Create a thread that prints numbers from 1 to 10.

public class PrintThreadMain extends Thread {

    public void run()
    {
        for(int i=1;i<=10;i++){
            System.out.println(i);

        }
        try{
            Thread.sleep(5000);


        }catch(Exception e){

        }

    }

    public static void main(String[] args) {
       PrintThreadMain printThreadMain= new PrintThreadMain();
       printThreadMain.start();
    }
}
