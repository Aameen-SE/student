package jva.may03;

public class MaxMinElementinArr {
    public static void main(String[] args) {
        int[] arr = {34,12,56,65,78,87,56};
        printMax(arr);
        printMin(arr);

    }
    public static void printMin(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element in the array : "+min);
    }
    public static void printMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array :"+max);
    }
}
