package javacore.forloop;

public class Program7 {
    public static void main(String[] args) {
        //wap to print all numbers between 30 to 50 those are not divisible by 7.
        System.out.println(" Print all numbers between 30 to 50 those are not divisible by 7.");
        for(int i =30;i<=50;i++){
            if(i%7!=0){
                System.out.println(i);
            }
        }
    }
}
