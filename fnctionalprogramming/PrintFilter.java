package fnctionalprogramming;

import java.util.List;

public class PrintFilter {
    public static void main(String[] args) {
        List<String> list= List.of("Apple", "Cat","Bat", "Dog");
        printBasicWithFilter(list);
        System.out.println();
        printFilterWithFP(list);
    }
    private static void printBasicWithFilter(List<String>list){
        for(String string :list){
            if(string.endsWith("at")){
                System.out.println(string);
            }
        }
    }


    private static void printFilterWithFP(List<String>list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach
                        (element -> System.out.println(element));
    }





}
