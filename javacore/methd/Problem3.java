package javacore.methd;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        //	2.	void printPositive(int[]), method will print all positive number from supplied array
        int [] arr = {-12,34,-56,89,-90};
        System.out.println("Arrays are : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Positive Number in array are : ");
        printPositive(arr);

    }
    static void printPositive(int[]ar){
        for(int a:ar){
            if(a>=0){
                System.out.print(a+" ");
            }
        }
    }
}
