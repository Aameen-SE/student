package jva.may21;
//Problem: Shared Counter with Two Threads
//Problem Statement:
//
//Create a Java program with a shared counter that starts at 0.
//Two threads should increment the counter 5 times each.

class SharedCounter{
    private int count=0;

    public synchronized void increment(){
        count++;
        System.out.println("Counter :"+count);
    }
}

class  CounterThread implements Runnable{
    private SharedCounter counter;
    public CounterThread(SharedCounter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
    for(int i=0;i<5;i++){
        counter.increment();
        try{
            Thread.sleep(300);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
    }
}

public class TwoThreadCounter {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        Thread thread1= new Thread(new CounterThread(counter));
        Thread thread2 = new Thread(new CounterThread(counter));
        thread1.start();
        thread2.start();
    }
}
