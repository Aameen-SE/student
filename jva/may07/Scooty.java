package jva.may07;
class Vehicle1 {
    void start(){
        System.out.println("Starting ...");
    }
}
class InsertKey extends Vehicle1{
    void addKey(){
        System.out.println("Key is added...");
        // use of super()
        super.start();
    }
}
// Multi Level Inherit
public class Scooty extends InsertKey{
    public static void main(String[] args) {
        Scooty scooty=new Scooty();
        scooty.addKey();
        scooty.start();
    }
}
