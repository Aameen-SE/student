package collectin.lst.aarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        //Write a program to reverse an ArrayList of integers without using the Collections.reverse() method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int left =0;
        int right = numbers.size()-1;

        while (left<right){
            Integer temp = numbers.get(left);
            numbers.set(left,numbers.get(right));
            numbers.set(right,temp);

            left++;
            right--;
        }
        System.out.println(numbers);
    }
}
