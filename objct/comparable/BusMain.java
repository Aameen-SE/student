package objct.comparable;
//Create a Bus class with fields routeNumber and seatingCapacity.
// Sort buses by seating capacity descending, and if same, sort by route number.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bus implements Comparable<Bus>{
    private int routeNumber;
    private int seatCapacity;

    public Bus(int routeNumber, int seatCapacity) {
        this.routeNumber = routeNumber;
        this.seatCapacity = seatCapacity;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return "RouteNumber : "+routeNumber+" SeatCapacity : "+seatCapacity;
    }

    @Override
    public int compareTo(Bus o) {
        int seatSort = o.seatCapacity-this.seatCapacity;
        if(seatSort==0){
            return o.routeNumber-this.routeNumber;
        }
        return seatSort;
    }
}
public class BusMain {

    public static void main(String[] args) {

        List<Bus> buses = new ArrayList<>();

        buses.add(new Bus(14,120));
        buses.add(new Bus(13,160));
        buses.add(new Bus(12,120));
        buses.add(new Bus(17,180));

        Collections.sort(buses);
        for(Bus b:buses){
            System.out.println(b);
        }

    }
}
