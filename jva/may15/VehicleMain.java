package jva.may15;

//Create a base class Vehicle with:
//Properties: make, model, year

//Method: displayInfo() to print vehicle details
//Create subclasses:
//Car with an additional property numDoors
//Truck with an additional property loadCapacity
//Motorcycle with an additional property hasSidecar (boolean)
//Override displayInfo() in each subclass to show all relevant details.
//In the main() method:
//Create one object of each subclass
//Call their displayInfo() method

class Vehicle{
    private String model;
    private String year;

    Vehicle(String model, String year){
        this.model=model;
        this.year=year;
    }

    void displayInfo(){
        System.out.println(model+ " "+year);
    }

    }

class Car extends Vehicle {
    private int numDoors;

    Car(String model, String year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }
        @Override
   public void displayInfo(){
        System.out.println();
    }
}

class Truck extends Vehicle{
private double loadCapacity;
    Truck(String model, String year, double loadCapacity) {
        super(model, year);
        this.loadCapacity=loadCapacity;
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota","2005",4);
        car.displayInfo();
    }
}
