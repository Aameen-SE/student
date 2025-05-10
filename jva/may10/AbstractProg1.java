package jva.may10;
abstract  class Add{
    // abstract method and abstract class
    abstract void run();
    //abstract class but not abstract method
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
public class AbstractProg1 extends Add{
    public static void main(String[] args) {

        AbstractProg1 abs = new AbstractProg1();
        abs.add(12,34);
        abs.run();
    }

    @Override
    void run() {
        System.out.println("Running .....");
    }
}
