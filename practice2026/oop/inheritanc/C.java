package practice2026.oop.inheritanc;

public class C extends B{


    public void methodC() {
        System.out.println("C method is called");
    }

    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
