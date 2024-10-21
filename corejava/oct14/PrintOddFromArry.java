package corejava.oct14;

import java.util.Arrays;

public class PrintOddFromArry {
    //wap to print only odd numbers from an array
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,23,42,56,88};

        System.out.println("arr : "+Arrays.toString(arr));

        System.out.println("Printing only odd numbers from an array ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ; ");
            }
        }

    }
}
