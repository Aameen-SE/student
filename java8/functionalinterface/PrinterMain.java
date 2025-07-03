package java8.functionalinterface;

//Create a functional interface called Printer with a method void print(String message).
// Implement it using a lambda expression and print any message.

@FunctionalInterface
interface Printer{
    void print(String msg);
}
public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = (msg) -> System.out.println("Message : "+msg);
        printer.print("Hey There !");
    }
}
