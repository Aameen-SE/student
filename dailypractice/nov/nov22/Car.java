package dailypractice.nov.nov22;
//8️⃣ Default Method in Interface
//
//Create an interface Vehicle with:
//
//abstract method start()
//
//default method fuelType()
//
//Implement this interface in class Car.

interface Vehicle {
    abstract  void start();

    default void fuelType(){
        System.out.println("FuelType Default method ");
    }
}
public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.fuelType();
    }

}
