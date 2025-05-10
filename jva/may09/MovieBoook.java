package jva.may09;
// static synchronized
class SeatBoook {
    static int total_Seat =20;

   static synchronized void bookSeatt(int seats){
    {  if(total_Seat>=seats){
            System.out.println("Seat Book successfully");
            total_Seat=total_Seat-seats;
        }else {
            System.out.println("Seat cannot be booked ");
            System.out.println("Total seat is available : "+total_Seat);
        }
        }

    }
}
class Thread1 extends Thread{
    SeatBoook sb;
    int seats;
   Thread1(SeatBoook sb , int seats){
       this.sb=sb;
       this.seats=seats;
   }

    @Override
    public void run() {
        sb.bookSeatt(seats);
    }

}

class Thread2 extends Thread{
    SeatBoook sb;
    int seats;
    Thread2(SeatBoook sb , int seats){
        this.sb=sb;
        this.seats=seats;
    }

    @Override
    public void run() {
        sb.bookSeatt(seats);
    }

}
public class MovieBoook {
    public static void main(String[] args) {
        SeatBoook sb = new SeatBoook();

        Thread1 tr1 = new Thread1(sb,17);
        tr1.start();

        Thread2 tr2 = new Thread2(sb,10);
        tr2.start();

        Thread1 tr3 = new Thread1(sb,7);
        tr3.start();

        Thread2 tr4 = new Thread2(sb,5);
        tr4.start();
    }
}
