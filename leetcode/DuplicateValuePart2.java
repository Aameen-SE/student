package leetcode;

import java.util.Arrays;

public class DuplicateValuePart2 {
    public static void main(String[] args) {

        int[] arr = {12,32,45,21,67,67};
        boolean result = checkDupli(arr);

        if(result==true)
            System.out.println("True");
        else
            System.out.println("False");

    }

    static boolean checkDupli(int[]ar){

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]&&i!=j)
                    return true;
            }
        }
        return false;
    }
}
