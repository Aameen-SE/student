package jva.oop.june30;

// Car and Engine classes
//
//Car class with brand, model, and an Engine object.
//
//Engine class with type (e.g., petrol/diesel) and horsepower.
//
//Print full car details

class Car{
    private String brand ;
    private String model;
    private Engine engine;

    public Car(String brand, String model, Engine engine){
        this.brand=brand;
        this.engine=engine;
        this.model=model;
    }

    public String toString(){
        return "Brand : "+brand+"\nModel : "+model+"\nEngine : "+engine;
    }
}
class Engine{
    private  String type ;
    private int horsepower;

    public Engine(String type , int horsepower){
        this.type=type;
        this.horsepower=horsepower;
    }

    public String toString(){
        return "type : "+type +"\nhorsepower : "+horsepower;
    }
}
public class CarMain {
    public static void main(String[] args) {
        Engine engine= new Engine("Diesel",330);
        Car car = new Car("BMW","BMW745d",engine);
        System.out.println(car.toString());
    }
}
