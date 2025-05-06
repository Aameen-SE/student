package jva.may06;
abstract class Abs {
    abstract void show();
}
public class AbstractProg1 extends Abs{
    @Override
    void show() {
    }

    public static void main(String[] args) {
        //we cannot create object of the abstract class
     //   Abs ab = new Abs();
       AbstractProg1 abs = new AbstractProg1();
       abs.show();
    }
}
