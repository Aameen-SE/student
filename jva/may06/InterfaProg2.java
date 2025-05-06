package jva.may06;

// Multiple Inheritance

interface Inte1{
    abstract void test();
}

interface Inte2{
    abstract void test2();
}
public class InterfaProg2 implements Inte1,Inte2{
    public void test(){
        System.out.println("Test1");
    }
    public void test2(){
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        InterfaProg2 inte = new InterfaProg2();
        inte.test();
        inte.test2();

    }
}
