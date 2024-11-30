package fnctionalprogramming.revise;

import java.util.List;

public class Nov30 {
    public static void main(String[] args) {
        List<String> list = List.of("Ant","Bat","Cat","Chat","Ball");
        printFilter(list);
        List<Integer>num = List.of(1,2,3,5,7,6,8,9);
        printMax(num);
    }

    private static void printElement(List<String>list){
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printFilter(List<String>list){
        list.stream().filter(e->e.endsWith("at")).forEach(e-> System.out.println(e));
    }

    private static void printSort(List<Integer>num){
        num.stream().sorted().forEach(e-> System.out.println(e));
    }

    private static void printSumOfList(List<Integer>num){
        int sum =num.stream().reduce(0,(n1,n2)->n1+n2);
        System.out.println(sum);
    }
    private static void printSumOfOddNum(List<Integer>num){
        int sum =num.stream()
                .filter(e->e%2==1)
                .reduce(0,(n1,n2)->n1+n2);
        System.out.println(sum);
    }

    private static void printMax(List<Integer>num){
        int max=num.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println(max);
    }

    private static void printOddInList(List<Integer>num){
        num.stream().filter(e->e%2==1).forEach(e-> System.out.println(e));
    }

    private static void printEven(List<Integer>num){
        num.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
    }
}
