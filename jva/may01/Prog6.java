package jva.may01;

public class Prog6 {
    public static void main(String[] args) {
        // sum of the given number num=12345;
        int num = 12345;
        int sum =0;

        for (int i=0;i<num;num=num/10){
            int lastDigit = num%10;
             sum =sum+lastDigit;
        }
        System.out.println("Sum of the given number is : "+sum);

    }
}
