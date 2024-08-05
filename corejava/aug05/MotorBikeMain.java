package corejava.aug05;

public class MotorBikeMain {
    public static void main(String[] args) {
        /*Class */ /*instance of Class */
    /*        |              |              */
        MotorBike       honda = new MotorBike(200);
        MotorBike      ducati = new MotorBike(100);

        ducati.setSpeed(100);


        honda.start();                       /*behaviour of the class */
        ducati.start();

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());






    }
}
