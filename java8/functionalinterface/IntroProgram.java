package java8.functionalinterface;

@FunctionalInterface
interface MyFunctionalInterface {
    void print();

    // give error as functional interface can have only one abstract method
   // void display();

    static void display(){
        System.out.println("static method : ----");
    }

    default void call(){
        System.out.println("default method : ----");
    }
}

class Intera implements MyFunctionalInterface{

    @Override
    public void print() {
        System.out.println("Printing ");
    }

}
public class IntroProgram {
    public static void main(String[] args) {
        Intera intera = new Intera();
        intera.print();
        intera.call();
        MyFunctionalInterface.display();
    }


}
