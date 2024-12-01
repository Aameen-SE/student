package fnctionalprogramming.revise;

import java.util.List;
import java.util.stream.IntStream;

public class Dec01 {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,34,67,98,23);

        int max=num.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println("Maximum in List : "+max);

        int min= num.stream().min((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println("Minimun in List : "+min);

        //sum of the num in list
        int sum =num.stream().reduce(0,(n1,n2)->n1+n2);
        System.out.println("Sum of the number in list : "+sum);

        //print odd and even from the list
        //odd
        num.stream().filter(e-> e%2==1).forEach(e-> System.out.println(e));
        // sum of odd num in list
        int oddSum=num.stream().filter(e->e%2==1).reduce(0,(n1,n2)->n1+n2);
        System.out.println("Odd Number sum : "+oddSum);

        // even
        num.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
        //even sum
        int evenSum = num.stream().filter(e->e%2==0).reduce(0,(n1,n2)->n1+n2);
        System.out.println("Sum of even num"+evenSum);

        List<String> list = List.of("Cat","Bat","Mat","Ball","Call");
        list.stream().filter(e->e.endsWith("all")).forEach(e-> System.out.println(e));
        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.println(e));




    }
}
