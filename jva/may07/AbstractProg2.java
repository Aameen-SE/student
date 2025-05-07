package jva.may07;
abstract class Test2{
    void test(){
        System.out.println("Abstract class but not abstract method");
    }
}
public class AbstractProg2 extends Test2{
    public static void main(String[] args) {
        AbstractProg2 abs = new AbstractProg2();
        abs.test();
    }
}
