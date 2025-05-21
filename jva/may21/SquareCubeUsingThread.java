package jva.may21;
//Calculate Square and Cube of Numbers Using Two Threads
//Problem Statement:
//
//Write a Java program that uses two threads:
//
//One thread calculates and prints the square of numbers from 1 to 5.
//
//The other thread calculates and prints the cube of numbers from 1 to 5.
class SquareThread implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Square of i :"+i+" = "+(i*i)+"\n");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

class CubeThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Cube of i:"+i+" = "+(i*i*i)+"\n");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class SquareCubeUsingThread {
    public static void main(String[] args) {

        Thread squareThread = new Thread(new SquareThread());
        Thread cubeThread = new Thread(new CubeThread());
        squareThread.start();
        cubeThread.start();
    }
}
