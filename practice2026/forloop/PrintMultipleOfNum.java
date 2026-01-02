package practice2026.forloop;

import java.util.Scanner;

public class PrintMultipleOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its table ");
        int num = sc.nextInt();

        multiple(num);
    }
    public static void multiple(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i +" = "+(i*num));
        }
    }
}
