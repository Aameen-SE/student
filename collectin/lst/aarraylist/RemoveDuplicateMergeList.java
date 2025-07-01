package collectin.lst.aarraylist;

import java.util.*;

public class RemoveDuplicateMergeList {
    public static void main(String[] args) {

        //Merge two ArrayLists of strings into a single ArrayList and remove duplicates.

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(12,23,32,12,34,56,76,56));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(12,22,23,24,25,25,67,89,90));

        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(num1);
        mergedList.addAll(num2);

        System.out.println(mergedList);

        Set<Integer> setList = new HashSet<>(mergedList);

        ArrayList<Integer> finalList = new ArrayList<>(setList);
        System.out.println(finalList);

    }
}
