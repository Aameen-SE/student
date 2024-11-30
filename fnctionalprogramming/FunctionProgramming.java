package fnctionalprogramming;

import java.util.List;

public class FunctionProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Orange");
        printBasicWay(list);
        System.out.println();
        printFunctionalWay(list);

    }
    private static void  printBasicWay(List<String> list){
        for(String string :list){
            System.out.println(string);
        }
    }

    private static void  printFunctionalWay(List<String> list){
        list.stream().forEach(element -> System.out.println(element));
        }
    }



