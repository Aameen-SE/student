package corejava.sep21;

public class ImpleInte implements Inte2{
    @Override
    public void method1() {
        System.out.println("Method1 fron interface 1");
    }
    //mandatory to instantied other interface

    @Override
    public void method2() {
        System.out.println("Method 2 from interface 2");
    }
}
