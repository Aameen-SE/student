package javacore.forloop;

public class Program10 {
    public static void main(String[] args) {
        //wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
        System.out.println("Print all numbers between 10 to 50 those are divisible by 2 and 5.");

        for(int i =10;i<=50;i++){
            if(i%2==0&&i%5==0){
                System.out.println(i);
            }
        }
    }
}
