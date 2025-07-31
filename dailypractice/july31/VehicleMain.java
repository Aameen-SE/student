package dailypractice.july31;
//Create a base class Vehicle with brand and speed. Subclass Car adds fuelType.
// Display properties using inheritance.
class Vehicle
{
    private String brand ;
    private int speed ;

    Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Brand : "+brand+" \nSpeed : "+speed;
    }
}
class Car extends Vehicle{
    private String fuel;

    Car(String brand , int speeed , String fuel){
         super(brand,speeed);
         this.fuel=fuel;
     }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return super.toString()+ " \n Fuel : "+fuel+" \n======";
    }
}
public class VehicleMain {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota",345,"Petrol");
        System.out.println(car1);

    }
}
