package jva.may04;
class A {
    void printA(){
        System.out.println("A print method ");
    }
}

class B extends A{
    // single heritance
    void printB(){
        System.out.println("B print method ");
    }
}

class C extends B{
    // multi level inheritance
    void printC(){
    System.out.println("C print method ");
}
}

class D extends A{
    void printD(){
        System.out.println("D print method ");
    }
}
public class InheritTypes {
    public static void main(String[] args) {
        A showA = new A();
        showA.printA();

        System.out.println("------------------- Single Inheritance----");

        B showB = new B();
        showB.printB();
        showB.printA();
        System.out.println("-------------------Multi Level Inheritance------");

        C showC = new C();
        showC.printC();
        showC.printB();
        showC.printA();

        System.out.println("-------------------Hierarcal  Inheritance------");
        D showD = new D();
        showD.printD();
        showD.printA();







    }
}
