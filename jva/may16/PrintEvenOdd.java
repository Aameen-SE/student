package jva.may16;
//Problem Statement:
//
//Write a Java program using multithreading where:
//
//One thread prints even numbers
//
//Another thread prints odd numbers
//
//They must print alternately in sequence from 1 to N.
class Printer{
    private int num =1;
    private int max;
    private final Object lock = new Object();

    public Printer(int max){
        this.max=max;
    }

    public void printOdd(){
        synchronized (lock){
            for(;num<=max;){
                if(num%2==0){
                    try{
                        lock.wait();
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Odd :"+num);
                    num++;
                    lock.notify();
                }
            }
        }
    }

    public void printEven(){
        synchronized (lock){
            for(;num<=max;){
                if(num%2!=0){
                    try{
                        lock.wait();
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                }
                else {
                    System.out.println("Even : "+num);
                    num++;
                    lock.notify();
                }
            }
        }
    }
}
public class PrintEvenOdd extends Thread{
    public static void main(String[] args) {
        Printer printer = new Printer(10);

        Thread thread1 = new Thread(()->printer.printOdd());
        Thread thread2 = new Thread(()-> printer.printEven());
        thread1.start();
        thread2.start();
    }

}
