package dailypractice.nov.nov21;
//Create a class Vehicle with start() and stop() methods.
//
//Create a subclass Car that overrides both methods. Demonstrate method overriding.**

class Vehicle{

    public  void start(){
        System.out.println("Vehicle is started");
    }

    public  void stop(){
        System.out.println("Vehicle is Stopped!");
    }


}
 class Car extends Vehicle{

    @Override
    public  void start(){
        System.out.println("Car is started");
    }

    @Override
    public  void stop(){
        System.out.println("Car is Stopped!");
    }

}

public class CarMain{
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}


