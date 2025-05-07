package jva.may07;
interface inte1{
    public abstract void show();
}

interface inte2{
    void show2();
}
public class InterfaceProg1 implements inte1,inte2{
    public void show(){
        System.out.println("INterface .... ");
    }
    public void show2(){
        System.out.println("Interface 2 show...");
    }
    public static void main(String[] args) {
        InterfaceProg1 inte2 = new InterfaceProg1();
        inte2.show();
        inte2.show2();
    }
}
