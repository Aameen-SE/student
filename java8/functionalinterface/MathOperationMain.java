package java8.functionalinterface;
//Create a functional interface MathOperation with a method int operate(int a, int b).
// Implement addition, subtraction, multiplication, and division using lambdas. Test each implementation.

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}
public class MathOperationMain {

    public static void main(String[] args) {

        MathOperation add = (a,b) -> a+b ;
        System.out.println( add.operate(12,34));

        MathOperation sub= (a,b)->b-a;

        System.out.println(  sub.operate(12,54));

        MathOperation prod = (a,b)->a*b;
        System.out.println( prod.operate(12,6));


        MathOperation div = (a,b)->b/a;
        System.out.println( div.operate(2,12));


    }
}
