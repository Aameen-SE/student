package jva.may10;
//inheritance

class Vehicle{
    public void startEngine(){
        System.out.println("Engine is starting ");
    }

}
 class Scooty extends Vehicle{
   public void test(){
       System.out.println("Scooty is running");
   }
}

public class Car  extends Scooty{
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.test();
    }

}


