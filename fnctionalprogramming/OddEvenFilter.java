package fnctionalprogramming;

import java.util.List;

public class OddEvenFilter {
    public static void main(String[] args) {
        List<Integer>num = List.of(1,2,4,5,6,8,9);

        printEvenUsingFP(num);
    }

    private static void printBasicOdd(List<Integer>num){
        for(Integer n :num){
            if(n%2!=0){
                System.out.println(n);
            }
        }
    }

    private static void printBasicEven(List<Integer>num){
        for(Integer n :num){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }

private static void printOddUsingFP(List<Integer>num){
        num.stream()
                .filter(element -> element%2==1)
                .forEach(element -> System.out.println(element));
}

private static void printEvenUsingFP(List<Integer>num){
        num.stream()
                .filter(element -> element%2==0)
                .forEach(element -> System.out.println(element));
}



}
