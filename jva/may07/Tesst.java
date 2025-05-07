package jva.may07;
abstract class Test1 {
    abstract void show();
}



public class Tesst extends Test1 {
    public static void main(String[] args) {
        Tesst t5 = new Tesst();
        t5.show();

    }
        void show() {
        System.out.println("Overridden abstract method ");
    }
}
