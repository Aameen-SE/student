package jva.april30;

public class Prog3 {
    public static void main(String[] args) {
        //wap to find factorial of a given number using while loop
        int num =6;
        int fact = 1;
        int i =1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
