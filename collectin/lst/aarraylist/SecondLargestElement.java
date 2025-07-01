package collectin.lst.aarraylist;

import java.util.ArrayList;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(121);
        numbers.add(112);
        numbers.add(102);
        numbers.add(172);

        System.out.println(numbers);

        int firstLargestNum = Integer.MIN_VALUE;
        int secondLargestNum=Integer.MIN_VALUE;
        for(int n:numbers){
            if(n>firstLargestNum){
                secondLargestNum=firstLargestNum;
                firstLargestNum=n;
            }
        }

        System.out.println("Second largest number = "+secondLargestNum);
    }
}
