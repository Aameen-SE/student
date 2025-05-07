package jva.may07;
class Test extends Vehicle{
    void test(){
        System.out.println("Testing....");
    }
}
// as we can see vehichle is extended by  two of the child class
//Hierarical Inheritance
public class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
    }
}
