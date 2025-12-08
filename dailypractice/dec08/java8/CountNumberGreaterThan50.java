package dailypractice.dec08.java8;

import java.util.Arrays;
import java.util.List;

public class CountNumberGreaterThan50 {
    public static void main(String[] args) {
        //Count how many numbers > 50

        List<Integer> numbers = Arrays.asList(100,20,360,45,50,64,78);
        long  count = numbers.stream().filter(e->e>50).count();
        System.out.println(count);
    }
}
