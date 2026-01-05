package practice2026.array;

import java.util.ArrayList;
import java.util.List;

public class OddElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printOdd(arr);
    }

    public static void printOdd(int[] arr){
        List<Integer> oddElement = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(isOdd(arr[i])){
                oddElement.add(arr[i]);
            }
        }

        System.out.println("Odd ELement in the array is :"+oddElement);
    }
    public static boolean isOdd(int num){
        if(num%2!=0){
            return true;
        }
        return false;
    }
}
