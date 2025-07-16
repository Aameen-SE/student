package designpattern.factory;

//1️⃣ Create an interface called Vehicle with a method start().
////2️⃣ Create three concrete classes that implement Vehicle:
////Car — prints "Car started"
////Bike — prints "Bike started"
////Truck — prints "Truck started"
////3️⃣ Create a VehicleFactory class that has a method getVehicle(String vehicleType) that returns the appropriate object based on input.
////4️⃣ Write a main class to test it: create different vehicle objects using the factory and call start() on them.

interface Vehicle{
    void start();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting ....");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting ....");
    }
}

class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck is starting ....");
    }
}

class VehicleFactory {

    public Vehicle getVehicle(String type){
        if(type==null){
            return null;
        }

        switch (type){
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Truck":
                return new Truck();
            default:
                return null;
        }
    }
}
public class VehicleMain {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("Car");
        vehicle.start();
    }
}
