package dailypractice.nov.nov19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if (it.next()%2==0)
                it.remove();
        }
        System.out.println(list);
    }
}
