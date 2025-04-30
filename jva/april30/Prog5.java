package jva.april30;

public class Prog5 {
    public static void main(String[] args) {
        //wAP to find the sum of the number num=12345 in for loop

        int num=7896;
        int sum=0;
        for(;num!=0;num=num/10){
            int digit = num%10;
            sum=sum+digit;

        }
        System.out.println("Sum of the number is : "+sum);


    }
}
