package objct.comparable;
// Create a Mobile class with fields modelName and batteryCapacity. Sort mobiles by battery capacity descending


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile>{
    private  String  modelName;
    private int batteryCapacity;


    public Mobile(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "modelName='" + modelName + ", batteryCapacity=" + batteryCapacity ;
    }


    @Override
    public int compareTo(Mobile o) {
        return o.batteryCapacity-this.batteryCapacity;
    }
}
public class MobileMain {

    public static void main(String[] args) {

        List<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new Mobile("IqooZ6 Lite",3000));
        mobiles.add(new Mobile("IqooZ1 Lite",6500));
        mobiles.add(new Mobile("IqooZ9 Lite",5000));
        mobiles.add(new Mobile("Micromax",4500));

        Collections.sort(mobiles);

        for (Mobile m : mobiles){
            System.out.println(m);
        }
    }
}
