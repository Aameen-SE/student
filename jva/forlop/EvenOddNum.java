package jva.forlop;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        //Wap to print all even and odd numbers between 1 to 100.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice : \n1.Print all the even number from 1 to 100 \n2.Print all the odd number from 1 to 100");
        int choice =sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("All the even number from 1 to 100 is : ");
                for(int i=1;i<=100;i++){
                    if(i%2==0) {
                        System.out.print(i + " , ");
                    }
                }
                break;

            case 2:
                System.out.println("All the odd number from 1 to 100 is : ");
                for(int i=1;i<=100;i++){
                    if(i%2!=0)
                        System.out.print(i+" , ");
                }
                break;

        }
        sc.close();
    }
}
