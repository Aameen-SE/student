package collectin.lst.feb07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyAscCompare implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1-i2;
    }
}

class MyDesComp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return 02-01;
    }
}

class MyAscCompString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

class MyDescCompString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
public class Program1 {
    public static void main(String[] args) {



        List<Integer> list1 =List.of(1,2,3,4,5,6,7,8);

       // list1.add(122); it doesnt add , as it is immutable not it cannot add, remove , replace
        System.out.println("Immutable : List :"+list1);

        // converting the list1 into mutable then adding the integer as after mutable it can add replace remove
        ArrayList<Integer> intAl = new ArrayList<>(list1);
        intAl.add(9);
        System.out.println("Mutable :List to ArrayList :"+intAl);

        // checking the element

        System.out.println(intAl.contains(5));

        // creating arraylist
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // removing the value from index
        list.remove(1);
        System.out.println(list);

        //removing the value on basis of object
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        // checking the size
        System.out.println(list.size());

        // sorting the arraylist
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(11);

      //  Collections.sort(num);
        //System.out.println(num);

        // sorting the arraylist using my own comparator

        //ascending order
       // num.sort(new MyAscCompare());
        //System.out.println(num);
        // ascend in lambda expression
        num.sort((a,b)-> a-b);
        System.out.println(num);
        //descending order
     //   num.sort(new MyDesComp());
       // System.out.println(num);
        num.sort((a,b)->b-a);
        System.out.println(num);

        // ascending and descending of string
        List<String> word = new ArrayList<>();
        word.add("apple");
        word.add("banana");
        word.add("date");

        //ascending order
      //  word.sort(new MyAscCompString());
        //System.out.println(word);

        //ascend using lamda expression
        word.sort((a,b)->a.length()-b.length());
        System.out.println(word);

        // descending order
      //  word.sort(new MyDescCompString());
        //System.out.println(word);

        word.sort((a,b)->b.length()-a.length());
        System.out.println(word);


    }
}
