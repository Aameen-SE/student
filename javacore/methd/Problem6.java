package javacore.methd;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //void printNum(int[], int), method will print number if found in array from supplied array
        //		e.g. if a[]={1,2,3} n b=2 then print 2
        int [] arr = {1,2,3,4,5,67,7,8,9,0,6,34,65,78,32,12};
        printNum(arr);
    }
    public static void printNum(int[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        for(int a:ar){
            if(num==a){
                System.out.println(num);
            }
        }
    }
}
