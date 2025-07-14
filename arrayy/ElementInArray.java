package arrayy;

import java.util.Arrays;

public class ElementInArray {

    public static void main(String[] args) {

        int[] arr ={12,13,14,15,16,17};

        System.out.println("Element in array : "+ Arrays.toString(arr));

        System.out.println("Odd ELement in array : ");
        printOddElement(arr);

        System.out.println("\nEven element in array : ");
        printEvenElement(arr);
    }

    public static void printOddElement(int[]arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" , ");
            }
        }
    }

    public static void printEvenElement(int[]arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" , ");
            }
        }
    }
}
