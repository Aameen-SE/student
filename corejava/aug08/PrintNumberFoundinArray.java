package corejava.aug08;

import java.util.Scanner;

public class PrintNumberFoundinArray {
    public static void main(String[] args) {
        //void printNum(int[], int), method will print number if found in array from supplied array
        int[] array={12,24,54,9,89,10,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched :");
        int n=sc.nextInt();

        printNum(array,n);

    }
    public static void printNum(int[]arr,int n){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n){
                System.out.println("arr["+i+"] :"+arr[i]);

            }else {
                System.out.println("num :" + n + " is not in an array ");
                break;
            }

        }
    }
}
