package fnctionalprogramming.stream;

import java.util.List;
import java.util.stream.IntStream;

public class SquareOfFirst10Integer {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        IntStream.range(1,11)
                .map(e->e*e)
                .forEach(e-> System.out.println(e));
    }
}
