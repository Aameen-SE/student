package dsa.june01;

public class MaxMinArr {
    public static void main(String[] args) {
        int[] arr={14,52,36,74,15,25,4};

        maxArr(arr);
        minArr(arr);
    }
    public static void minArr(int[]arr){
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min Element in array : "+min);
    }
    public static void maxArr(int[]arr){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max Element in array : "+max);
    }
}
