package jva.may06;
interface Inter{
    abstract void show();
}
// implements interface
public class InterfacProg1 implements Inter{
    public void show(){
        System.out.println("------");
    }

    public static void main(String[] args) {
        InterfacProg1 inte = new InterfacProg1();
        // Cannot create object of interface class

        // Inter interf = new Inter();
        inte.show();
    }
}
