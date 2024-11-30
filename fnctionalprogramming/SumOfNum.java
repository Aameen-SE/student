package fnctionalprogramming;

import java.util.List;

public class SumOfNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
            int sum = list.stream().reduce(0,(number1,number2)-> number1+number2);
        System.out.println(sum);
    }


}
