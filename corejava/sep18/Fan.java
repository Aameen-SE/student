package corejava.sep18;

public class Fan {

    private int speed;
    private boolean isOn ;
    private String make;
    private String color;
    private double radius;

   public Fan(String make, double radius,String color){
        this.make=make;
        this.color=color;
        this.radius=radius;
    }

    public void switchOn(){
       this.isOn=true;
    }
    public void switchOff(){
        this.isOn=false;
        setSpeed(0);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString(){
        return String.format("make - %s , radius - %f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);
    }


}
