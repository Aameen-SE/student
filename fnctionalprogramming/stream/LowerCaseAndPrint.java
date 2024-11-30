package fnctionalprogramming.stream;

import java.util.List;

public class LowerCaseAndPrint {
    public static void main(String[] args) {
        List<String> list = List.of("APPLE","BAT","CAT");
        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.println(e));
        list.stream().map(e->e.length()).forEach(e-> System.out.println(e));
    }
}
