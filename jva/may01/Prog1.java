package jva.may01;

public class Prog1 {
    public static void main(String[] args) {
        //wap to find factorial of a given number using for loop

        int num = 5;
        int fact=1;

        for(int i =1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the given number is :"+fact);


    }
}
