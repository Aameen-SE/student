package corejava.aug29;

import java.util.Scanner;

public class ArryProgram3 {
    public static void main(String[] args) {
        int[] arr = {24, 54 , 85 ,94 , 65 , 78};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        printArr(arr);
        printDivNum(arr,num);
        printNotDivNum(arr,num);
    }
    public static void printArr(int[] arr){
        System.out.println("Given array : ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ; ");
        }
    }
    //wap to print number divisible by given number from an array
    public static void printDivNum(int[] arr, int gvNum){
        System.out.println("\nNumber from Array  divisible by given number : "+gvNum);
        for(int i =0;i<arr.length;i++){
            if(arr[i]%gvNum==0){
                System.out.println(arr[i]);
            }
        }
    }
    //wap to print number not divisible by given number from an array

    public static void printNotDivNum(int[] arr, int gvNum){
        System.out.println("Number from Array not divisible by given number : "+gvNum);
        for(int i =0;i<arr.length;i++){
            if(arr[i]%gvNum!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
