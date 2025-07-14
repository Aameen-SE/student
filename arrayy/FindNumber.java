package arrayy;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {

        int[] arr ={12,13,14,15,16,17};

        System.out.println("ELement in arrays : "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the divisible : ");
        int num = sc.nextInt();

        System.out.println("Element divisble by given number is : ");
        isDivisible(arr,num);
        System.out.println("\nElement is not divisble by given number is : ");
        isNotDivisible(arr,num);

    }
    public static void isDivisible(int[] arr, int num){
        for(int i=0;i<arr.length;i++){

            if(arr[i]%num==0){
                System.out.print(arr[i]+" , ");
            }

        }
    }

    public static void isNotDivisible(int[] arr, int num){
        for(int i=0;i<arr.length;i++){

            if(arr[i]%num!=0){
                System.out.print(arr[i]+" , ");
            }

        }
    }
}
