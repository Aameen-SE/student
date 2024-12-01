package fnctionalprogramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumber implements Predicate<Integer>{
    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}
public class LambdaRunner {
    public static void main(String[] args) {
        List<Integer> num = List.of(24,35,64,75,68);
        num.stream().filter(new EvenNumber()).forEach(e-> System.out.println(e));
    }

}
