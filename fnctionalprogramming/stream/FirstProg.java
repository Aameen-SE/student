package fnctionalprogramming.stream;

import java.util.List;

public class FirstProg {
    public static void main(String[] args) {

        List<Integer> num = List.of(2,5,7,4,1,10);
        // sort the num
      //  num.stream().sorted().forEach(element -> System.out.println(element));

        // distinct and sorting the element in stream
        List<Integer> num1 = List.of(2,5,5,7,4,4,1,10);
      //  num1.stream().distinct().sorted().forEach(element -> System.out.println(element));

        // square of the num with distinct and sorted

        num.stream().sorted().map(e->e*e).forEach(e -> System.out.println(e));
        num1.stream().distinct().sorted().map(e->e*e).forEach(e-> System.out.print(e+ " , "));
    }
}
