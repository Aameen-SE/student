package corejava.aug05;

public class MotorBike {
   private int speed;

    MotorBike(int speed){
        this.speed=speed;
    }

        void setSpeed(int speed){
            this.speed=speed;
        }

        int getSpeed(){
            return this.speed;
        }

        void increaseSpeed(int howMuch){
            this.speed=speed+howMuch;
        }

        void start(){
            System.out.println("Bike Started ");
        }


}
