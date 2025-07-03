package java8.functionalinterface;
// Use the Supplier functional interface to generate and return a random number.
// Call the supplier multiple times and print the random numbers.

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        Supplier<Integer> number = ()-> random.nextInt(100);
        for (int i=1;i<=5;i++){
            System.out.println(number.get());
        }
    }
}
