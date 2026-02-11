package practice2026.oop.interfce;



public class Bike implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Bike Engine is starting");
    }

    public static void main(String[] args) {
         Vehicle car = new Car();
        car.startEngine();
        Vehicle bike = new Bike();
        bike.startEngine();
    }
}
