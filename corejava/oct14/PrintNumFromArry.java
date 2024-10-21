package corejava.oct14;

import java.util.Arrays;

public class PrintNumFromArry {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,23,42,56,88};
        System.out.println("arr : "+ Arrays.toString(arr));
        printEvenFromArray(arr);
        printPositiveNum();
    }
    //wap to print only even numbers from an array
    public static void printEvenFromArray(int[] arr){

        System.out.println("Printing the even number from array : ");
        for(int i =0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ; ");
            }
        }
    }

    //wap to print only positive number from an array
    public static void printPositiveNum(){
        int[] arr = {2,3,-4,-5,6,-7,8,9,-23,42,-56,88};
        System.out.println("\narr :"+Arrays.toString(arr));


        System.out.println("Printing the positive number from array ");
        for(int i =0;i< arr.length;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ; ");
            }
        }
    }
}
