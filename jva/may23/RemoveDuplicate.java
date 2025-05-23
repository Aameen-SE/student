package jva.may23;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr={12,32,65,65,74,89,89,69,54};

        Set<Integer> set = new HashSet<>();
        for(int a:arr){
            set.add(a);
        }

        System.out.println("After removing duplicate from the array : "+set);
    }
}
