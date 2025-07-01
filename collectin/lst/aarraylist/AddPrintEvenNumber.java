package collectin.lst.aarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create an ArrayList of integers and add 10 random numbers to it. Then, print only the even numbers from the list.
public class AddPrintEvenNumber {
    public static void main(String[] args) {
        List<Integer> listOfNum = Arrays.asList(123,45,55,67,89,80,21,44);
        List<Integer> list = new ArrayList<>(listOfNum);

        for(int n : list){
            if(n%2==0){
                System.out.println(n);
            }
        }

    }
}
