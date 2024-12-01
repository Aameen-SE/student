package fnctionalprogramming;

import java.util.List;

public class MethodRefernceRunner {
    public static void main(String[] args) {
      //  List.of("Ant","Bat","Cat").stream().map(e->e.length()).forEach(System.out::println);

        // converting everything into method references
        // even number
      //  List.of(12,43,54,67).stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
        //method reference
       List.of(12,43,54,67).stream().filter(MethodRefernceRunner::evenNum).forEach(System.out::println);

        //odd  number
     //   List.of(12,43,54,67).stream().filter(e->e%2==1).forEach(e-> System.out.println(e));
        //method reference
        List.of(12,43,54,67).stream().filter(MethodRefernceRunner::oddNum).forEach(MethodRefernceRunner::print);
    }
    public static boolean evenNum(Integer num){
        return num%2==0;
    }
    public static boolean oddNum(Integer num){
        return num%2==1;
    }
    public static void print(Integer num){
        System.out.println(num);
    }
}
