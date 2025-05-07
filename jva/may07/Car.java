package jva.may07;
class Vehicle {
    void start(){
        System.out.println("Starting..... ");
    }
}
// single inheritance
public class Car  extends Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Vehicle veh = new Vehicle();
        veh.start();

    }

}
