package fnctionalprogramming.revise;

import java.util.List;
import java.util.stream.Collectors;

public class Dec02 {
    public static boolean isOdd(Integer num){
        return num%2==1;
    }
    public static void main(String[] args) {

        // sum of even number
        int sum =List.of(1,24,45,67,98).stream().filter(e->e%2==0).reduce(0,(n1,n2)->n1+n2);
        System.out.println("Sum of all the even num : "+sum);

        // finding out the odd in the list
        List.of(1,24,45,67,98).stream().filter(Dec02::isOdd).forEach(e-> System.out.println(e));
        List.of(1,24,45,67,98).stream().filter(e->e%2==1).forEach(e-> System.out.println(e));

        // max and min in the list
       int max = List.of(1,23,45,67,98).stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println("Max in the list : "+max);

        int min = List.of(1,23,45,67,98).stream().min((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println("Min in the list : "+min);


        // using of optional : as it is only introduced for null pointer
        System.out.println( List.of(1,23,45,67,98).stream().max((n1,n2)->Integer.compare(n1,n2)));


        // Printing the list
        List.of("Ant","Bat","Mat","Ball","cat").stream().forEach(e-> System.out.println(e));
        List.of("Ant","Bat","Mat","Ball","cat").stream().forEach(System.out::println);      // method interface

        //Printing the list which ends with at

      List.of("Ant","Bat","Mat","Ball","cat").stream().filter(e->e.endsWith("at")).forEach(e-> System.out.println(e));
        List.of("Ant","Bat","Mat","Ball","cat").stream().filter(e->e.endsWith("at")).forEach(Dec02::print); //interface

        // collecting all of it in list using collect method
        System.out.println( List.of("Ant","Bat","Mat","Ball","cat").stream().filter(e->e.endsWith("at")).collect(Collectors.toList()));


    }

    public static void print(String string){
        System.out.println(string);
    }

}
