package dailypractice.july23;

import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {
        int[] arr = {12,15,16,18,19};
        System.out.println("Arrays :"+ Arrays.toString(arr));

        int j=0;
        int rev[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        System.out.println("Reverse Array :"+Arrays.toString(rev));
    }
}
