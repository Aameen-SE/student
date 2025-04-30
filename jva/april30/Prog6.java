package jva.april30;

import java.util.Arrays;

public class Prog6 {
    public static void main(String[] args) {
        int[] arr ={12,45,65,24,35,85,98,64,55};
        System.out.println(Arrays.toString(arr));
        System.out.println("Length of the array : "+arr.length);
        printEvenNum(arr);
        printOddNum(arr);
    }//wap to print only odd numbers from an array
    public static void printOddNum(int[] a){
        System.out.println("\nOdd number in the array : ");

        for(int i =0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" , ");
            }
        }
    }
    //wap to print only even numbers from an array
    public static void printEvenNum(int[]ar){
        System.out.println("Even number in the array :");
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                System.out.print(ar[i]+" , ");
            }
        }
    }
}
