package jva.may23;
//Create an interface Vehicle with methods start(), stop(), and fuelType().
//Implement it in classes Car and Bike.

interface  Vehicle {
    abstract  void start();
    abstract  void stop();
    abstract  void fuelType();

}

class Car implements Vehicle{
    private String fuelType;

    public Car(String fuelType){
        this.fuelType=fuelType;
    }

    @Override
    public void start() {
        System.out.println(" CAR ENGINEE Started ......");
    }

    @Override
    public void stop() {
        System.out.println(" CAR ENGINEE Stoped ......");

    }

    @Override
    public void fuelType() {
        System.out.println(" CAR Fuel Type  "+fuelType);

    }
}

class Bike implements Vehicle{

    private String fuelType;

    public Bike(String fuelType){
        this.fuelType=fuelType;
    }
    @Override
    public void start() {
        System.out.println("Bike Engine Started .....");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped ....");
    }

    @Override
    public void fuelType() {
        System.out.println("Bike FuelType : "+fuelType);
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Car c = new Car("Diesel");
        Bike b = new Bike("Petrol");

        System.out.println("Bike : ");
        b.start();
        b.stop();
        b.fuelType();

        System.out.println("Car : ");
        c.start();
        c.stop();
        c.fuelType();
    }
}
