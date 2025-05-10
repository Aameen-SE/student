package jva.may09;

public class SeatedBook {
    int total_Seat = 10;

   synchronized void bookSeat(int seat){
        if(total_Seat>=seat){
            System.out.println("Seat Booked is successfully ");
            total_Seat=total_Seat-seat;
        }else {
            System.out.println("Seat cannot be booked ");
            System.out.println("Total Seat available : "+total_Seat);
        }
    }
}
