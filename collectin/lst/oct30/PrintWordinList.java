package collectin.lst.oct30;

import java.util.ArrayList;
import java.util.List;

public class PrintWordinList {
    public static void main(String[] args) {
        List<String> word =List.of("All","Ball","Mat","Call","Dog","Doll","Mall");
        System.out.println("Element in List : "+word);

        List<String> wordArr = new ArrayList<>(word);
        System.out.println("Element that contains ll : ");
        for (String w:wordArr){
            if (w.endsWith("ll")){
                System.out.println(w);
            }
        }
    }
}
