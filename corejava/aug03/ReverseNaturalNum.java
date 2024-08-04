package corejava.aug03;

import java.util.Scanner;

public class ReverseNaturalNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num ");
        int num = sc.nextInt();

        for(int i=num;i>=1;i--){
            System.out.print(i+" , ");
        }
    }
}
