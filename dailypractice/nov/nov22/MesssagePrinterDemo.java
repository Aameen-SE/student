package dailypractice.nov.nov22;


@FunctionalInterface
interface  MessagePrinter{

    void print();
}
//Use method reference to call a static method printMessage().
public class MesssagePrinterDemo {

    public static void printMessage(){
        System.out.println("Hey there !");
    }

    public static void main(String[] args) {
        MessagePrinter mp = MesssagePrinterDemo::printMessage;
        mp.print();
    }
}
