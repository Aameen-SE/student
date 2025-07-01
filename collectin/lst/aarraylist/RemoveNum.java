package collectin.lst.aarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNum {
    // Write a program to remove all occurrences of a specific element (e.g., 5) from an ArrayList of integers.
    public static void main(String[] args) {

        List<Integer> listOfNum = Arrays.asList(123,45,5,5,67,89,8,5,50,21,44);
        System.out.println(listOfNum);
        List<Integer> newList = new ArrayList<>();

        for(int a: listOfNum){
            if(a!=5){
                newList.add(a);
            }
        }

        System.out.println(newList);
    }

}
