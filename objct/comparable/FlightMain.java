package objct.comparable;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a Flight class with fields flightNumber and departureTime (as LocalTime). Sort flights by departure time.
class Flight implements Comparable<Flight>{
    private int flightName;
    private LocalTime departureTime;

    public Flight(int flightName, LocalTime departureTime) {
        this.flightName = flightName;
        this.departureTime = departureTime;
    }

    public int getFlightName() {
        return flightName;
    }

    public void setFlightName(int flightName) {
        this.flightName = flightName;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "flightName=" + flightName +", departureTime=" + departureTime ;
    }

    @Override
    public int compareTo(Flight o) {
        return this.departureTime.compareTo(o.departureTime);
    }
}
public class FlightMain {

    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight(145,LocalTime.of(10,30)));
        flights.add(new Flight(126,LocalTime.of(11,45)));
        flights.add(new Flight(133,LocalTime.of(01,00)));
        flights.add(new Flight(326,LocalTime.of(11,00)));

        Collections.sort(flights);

        for (Flight f:flights){
            System.out.println(f);
        }
    }
}
