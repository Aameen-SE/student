package jva.may29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMininList {
    public static void main(String[] args){

        List<Integer> li = new ArrayList<>(Arrays.asList(12,34,56,67,89,3,1,89));
        System.out.println("List : "+li);

        int max= Collections.max(li);
        int min=Collections.min(li);

        System.out.println("Maximum number in List is :"+max);
        System.out.println("Minimum number in list is : "+min);
    }
}
