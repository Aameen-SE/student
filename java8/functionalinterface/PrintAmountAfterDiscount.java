package java8.functionalinterface;

//Create a list of Double prices. Use the
// Consumer<Double> functional interface with a lambda to print
// each price with a 10% discount message, like:
//"Original price: 100.0, Discounted price: 90.0"


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintAmountAfterDiscount {

    public static void main(String[] args) {
        List<Double> price = Arrays.asList(100.0,200.0,399.0,4000.0);

        Consumer<Double> printDiscount = (p)-> {
            double discountPrice = p *0.9;
            System.out.println("Original Price : "+p+" Discount Price : "+discountPrice);
        };
        price.forEach(printDiscount);

    }
}
