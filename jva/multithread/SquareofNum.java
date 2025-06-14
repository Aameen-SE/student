package jva.multithread;
// Create a thread that prints the square of numbers from 1 to 5.
public class SquareofNum extends Thread{

    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            System.out.println("Square of "+i+" :  "+(i*i));
        }
    }

    public static void main(String[] args) {
        SquareofNum s = new SquareofNum();
        Thread thread = new Thread(s);
        thread.start();
    }
}
