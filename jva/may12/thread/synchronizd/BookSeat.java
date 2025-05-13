package jva.may12.thread.synchronizd;
// synchronized method
public class BookSeat {
    int totalSeat=20;
    int seats;



  synchronized    public void bookSeat(int seats){
        if(totalSeat>=seats){
            System.out.println("Seat Booked succesfully..");
            totalSeat=totalSeat-seats;
        }else {
            System.out.println("Seat cannot be booked ");
            System.out.println("Total Seat Available : "+totalSeat);
        }
    }
}
