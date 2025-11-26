package dailypractice.nov.nov26;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverseArr(arr);
    }
    public static void reverseArr(int[] arr){
        int[] reverseArr=new int[arr.length];
        int j=0;
        for (int i=arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
