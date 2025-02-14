package javacore.forloop;

import java.util.Scanner;

public class MultTableofNum {
    public static void main(String[] args) {
        //Wap to print multiplication table of any number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its multiplication table :");
        int num = sc.nextInt();

        for(int i =1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
