package enumm;
//Create an enum called Planet which contains the following planets with their respective gravity values (in m/s²):
//
//MERCURY (3.7)
//
//VENUS (8.87)
//
//EARTH (9.81)
//
//MARS (3.71)
//
//Add a field gravity to the enum and a method getGravity() to return it.
//
//Write a Java program that prints each planet's name along with its gravity.

enum Planet{
    MERCURY (3.7),VENUS (8.87),EARTH (9.81),MARS (3.71);

    private double gravity;

    Planet(double gravity){
        this.gravity=gravity;
    }

    public double getGravity() {
        return gravity;
    }

}
public class PlanetMain {

    public static void main(String[] args) {

        System.out.println("Planet with their Gravity : ");
        for(Planet p : Planet.values()){
            System.out.println(p+" : "+p.getGravity());
        }
    }
}
