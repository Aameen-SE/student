package dailypractice.nov.nov18;

import java.util.Scanner;
//	55.	Wap to count number of digits in a number.

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();
        countDigit(num);
    }

    public static void countDigit(int num){
        int count =0;

        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("No of digit in the number is :"+count);
    }
}
