package jva.forlop;

import java.util.Scanner;

public class ReversePrintNumber {
    //Print reverse pattern using for loop like:
    //54321 //4321  //321 //21 //1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point number : ");
        int num = sc.nextInt();

        for(int i =num;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
