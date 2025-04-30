package QuestionLeetCode;

import java.util.Scanner;

public class Day02Powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(isPowerof2(num));
    }

    public static boolean isPowerof2(int n) {
        if (n < 1)
            return false;
        else if (n==1) {
            return true;
        }
        else {
            while(n%2==0){
                n=n/2;
            }
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
