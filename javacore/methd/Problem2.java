package javacore.methd;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        //	1.	void printNegative(int[]), method will print all negative number from supplied array
        int [] arr = {-12,34,-56,89,-90};
        System.out.println("Arrays are : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Negative number in an array are : ");
        printNegative(arr);

    }
    public static void printNegative(int[] a){
        for(int ar: a){
            if(ar<=0)
                System.out.print(ar+" ");
        }
    }
}
