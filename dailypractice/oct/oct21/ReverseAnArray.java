package dailypractice.oct.oct21;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int ar[] ={1,2,3,4,5,6};
        int rev[] = new int[ar.length];
        int j=0;
        for(int i=ar.length-1;i>=0;i--){
            rev[j]=ar[i];
            j++;
        }

        System.out.println("Reverse Array : "+ Arrays.toString(rev));
    }
}
