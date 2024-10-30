package collectin.lst.oct30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day3Revision {
    public static void main(String[] args) {
        List<String> name = List.of("Aameen","Adil");
        System.out.println("List is created : "+name);
        List<String> nameArr = new ArrayList<>(name);
        nameArr.add("Faizan");
        System.out.println("New Element is added :"+nameArr);
        nameArr.remove("Adil");
        System.out.println("Element is removed :"+nameArr);

        List<String> name2=List.of("Komal","Shagufta");
        nameArr.addAll(name2);
        System.out.println("New collection of list is added in the previous list : "+nameArr);

        //Iteration around element
        //using for loop
        System.out.println("Iteration around tthe element using for loop : ");
        for (int i =0;i<nameArr.size();i++){
            System.out.print(nameArr.get(i)+" , ");
        }
        // using for each loop

        System.out.println("\nIteration around the element using for each loop :");
        for (String n : nameArr){
            System.out.println(n);
        }
        System.out.println("Iteration around the element using iterator :");
        // using iterator
        Iterator<String> iterator= nameArr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
