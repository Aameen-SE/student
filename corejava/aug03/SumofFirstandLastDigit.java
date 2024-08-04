package corejava.aug03;

import java.util.Scanner;

public class SumofFirstandLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
      int fd =  firstDigit(num);
      int ld = lastDigit(num);

      int sum = fd+ld;
        System.out.println("Sum of the first and last digit number is :"+sum);
    }
    public static int firstDigit(int num){

        while(num>=10){
            num=num/10;
        }

        return num;
    }
    public static int lastDigit(int num){
        num=num%10;

        return num;
    }
}
