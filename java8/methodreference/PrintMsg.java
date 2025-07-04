package java8.methodreference;

//Create a static method printMessage(String msg) in a class. Use a method reference to call it in a Consumer<String>.


import java.util.function.Consumer;

public class PrintMsg {

    public static void main(String[] args) {

        Consumer<String> print = PrintMsg::printMsg;
        print.accept("Hey There!");
    }

    public static void printMsg(String msg){
        System.out.println(msg);
    }

}
