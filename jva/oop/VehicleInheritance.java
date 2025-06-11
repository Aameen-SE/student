package jva.oop;

//Create a base class Vehicle with properties like speed and fuel.
// Then create subclasses like Car, Bike, etc., each overriding a run() method.

 class Vehicle{
    private int speed;
    private String fuel;

     void run(){};
}

class Car extends Vehicle{

    @Override
    void run() {
        System.out.println("Car engine started  ");
    }
}

class Bike extends Vehicle{

    @Override
    void run() {
        System.out.println("Bike engine started  ");
    }
}
public class VehicleInheritance {
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
        Bike bike = new Bike();
        bike.run();

    }
}
