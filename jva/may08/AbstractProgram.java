package jva.may08;
// abstraction
abstract class Abstrac extends Abs{
    abstract void print();
}
abstract class Abs{
    void show(){
        System.out.println("Abstraction class but not abstract method");
    }
}
public class AbstractProgram extends Abstrac {
    public static void main(String[] args) {
        AbstractProgram abss = new AbstractProgram();
        abss.print();
        abss.show();
    }

    @Override
    void print() {
        System.out.println("Abstrat class and abstract method ");
    }
}
