package corejava.aug29;

import java.util.Arrays;

public class ArrProgram4 {
    public static void main(String[] args) {
        int [] arr ={12 , 45 , 56 , 84 ,95 };
        printSumOfArray(arr);
        printGreatestNumInArr(arr);
        printSmallestNumInArr(arr);
    }
    //wap to find some of an array element
    public static void printSumOfArray(int[] arr){
        int sum=0;
        for(int a :arr){
            sum= sum+a;
        }
        System.out.println("Sum of the array :"+sum);
    }
    // wap to find greatest number from any array
    public static void printGreatestNumInArr(int[]arr){
        int grNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>grNum)
            {
                grNum=arr[i];
            }
        }
        System.out.println("Greatest Num in Array :"+grNum);

    }
    //wap to find smallest number among array element

    public static void printSmallestNumInArr(int[]arr){
        int smNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smNum)
            {
                smNum=arr[i];
            }
        }
        System.out.println("Smallest Num in Array :"+smNum);
        // Arrays 15 number

    }

}
