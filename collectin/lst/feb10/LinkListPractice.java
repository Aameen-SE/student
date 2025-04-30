package collectin.lst.feb10;

import java.util.LinkedList;
import java.util.List;

public class LinkListPractice {
    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6,7));
        num.add(8);
        System.out.println(num);
        num.sort((x,y)->y-x);
        System.out.println(num);

        num.removeIf(x->x%2==0);
        System.out.println(num);
         
    }
}
