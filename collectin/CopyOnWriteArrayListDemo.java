package collectin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> cop1 = new CopyOnWriteArrayList<>();

      //  List<String> l1 = new ArrayList<>();
        List<String> l1 = new CopyOnWriteArrayList<>();
        l1.add("Milk");
        l1.add("Egg");
        l1.add("Bread");

        for(String item :l1) {
            System.out.println(item);

            if(item.equals("Egg")){
                l1.add("Butter");
                System.out.println("Adding butter while reading ");
            }
        }
        System.out.println("Updated list : "+l1);

    }
}
