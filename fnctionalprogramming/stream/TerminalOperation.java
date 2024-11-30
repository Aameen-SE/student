package fnctionalprogramming.stream;

import java.util.List;
import java.util.stream.IntStream;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,153);
      int sum=  IntStream.range(0,6).reduce(0,(n1,n2)->n1+n2);
        System.out.println(sum);

        // max and min in the list
       int max = list.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println(max);

        int min = list.stream().min((n1,n2)-> Integer.compare(n1,n2)).get();
        System.out.println(min);
    }
}
