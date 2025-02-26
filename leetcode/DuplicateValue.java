package leetcode;

import java.util.Arrays;

public class DuplicateValue {
    public static void main(String[] args) {
        // Give an integer array nums, return true. If any value appears atleast twice in the array
        // and return false if every element in distinct

        int[] arr ={1,2,3,4,4};
        boolean b = checkDuplicate(arr);
        if(b==true){
            System.out.println("true");
        }
        else
            System.out.println("false");

        }
        static boolean checkDuplicate(int[]ar){
        Arrays.sort(ar);
        for(int i=1;i<ar.length;i++){
            if(ar[i]==ar[i-1]){
                return true;
            }
        }
        return false;
        }

    }
