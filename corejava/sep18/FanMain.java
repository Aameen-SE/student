package corejava.sep18;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1",0.123,"Black");
       fan.switchOn();
       fan.setSpeed(5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
