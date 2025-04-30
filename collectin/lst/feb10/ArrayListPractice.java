package collectin.lst.feb10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AscCom implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2) {
        return n2-n1;
    }
}
public class ArrayListPractice {
    public static void main(String[] args) {

        List<Integer> num = List.of(1,2,3,4,5,6,7,10,8,9);
        ArrayList<Integer> num2 = new ArrayList<>(num);

        num2.sort((a,b)->a-b);
        System.out.println(num2);

        num2.sort(new AscCom());
        System.out.println(num2);

    }
}
