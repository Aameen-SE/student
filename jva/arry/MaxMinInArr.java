package jva.arry;

public class MaxMinInArr {
    public static void main(String[] args) {
        int[] arr ={2,3,45,6,1};

        max(arr);
        min(arr);
    }

    public static void min(int[]ar){
        int min=ar[0];

        for(int i=1;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("Minimun element in array is : "+min);
    }
    public static void max(int[]ar){
        int max = ar[0];

        for(int i=1;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        System.out.println("Maximum Element in array :"+max);
    }
}
