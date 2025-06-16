package jva.arry;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {

        int[] ar ={1,2,3,4,5};
        Arrays.toString(ar);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotation : ");
        int k=sc.nextInt();

        k=k%ar.length;
        int n= ar.length;

        reverse(ar,0,n-1);
        reverse(ar,0,k-1);
        reverse(ar,k,n-1);

        System.out.println("Reverse order with rotate of k position : "+Arrays.toString(ar));
    }
    public static void reverse(int[] arr,int start , int end ){
        for(int i=start,j=end;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
