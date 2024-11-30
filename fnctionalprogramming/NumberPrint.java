package fnctionalprogramming;

import java.util.List;

public class NumberPrint {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,4,5,6,7,8);
        printNumUsingFP(num);

    }
    private static void printNumUsingFP(List<Integer> num){
        num.stream().forEach(element -> System.out.println(element));
    }
}
