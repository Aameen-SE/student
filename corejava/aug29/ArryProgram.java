package corejava.aug29;

import java.util.Arrays;

public class ArryProgram {
    public static void main(String[] args) {

        int[] arr ={12 , 14, 15 };
        System.out.println("Printing array using arraylist :"+ Arrays.toString(arr));
        System.out.println("\nPrinting array without using any loop ");
        printArr(arr);
        System.out.println("\nPrinting array using loop : ");
        printAr(arr);
    }

    //wap to create and print array using without loop
    public static void printArr(int[] ar){
        System.out.println("Length of an array : "+ar.length);
        System.out.println("array[1] : "+ar[0]);
        System.out.println("array[2] : "+ar[1]);
        System.out.println("array[3] : "+ar[2]);

    }
    //wap to create and print array using loop
    public static void printAr(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.println("array ["+i+"] : "+ar[i]);
        }
    }
}
