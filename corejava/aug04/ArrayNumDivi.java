package corejava.aug04;

import java.util.Scanner;

public class ArrayNumDivi {
    public static void main(String[] args) {
        //wap to print number divisible by given number from an array
        int[] arr ={12,34,54,76,89,98,15,27,45,};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num=sc.nextInt();

        System.out.println("The array number divisible by given number :");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%num==0){
                System.out.print(arr[i]+" ; ");
            }

        }
    }
}
