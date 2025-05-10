package jva.may09;
// use of synchronized method , synchronized block
public class MovieBookThread extends Thread{
   static SeatedBook sb;
        int seats;
    @Override
    public void run() {
        sb.bookSeat(seats);
    }

    public static void main(String[] args) {
        sb=new SeatedBook();
        MovieBookThread aameen = new MovieBookThread();
        aameen.seats=7;
        aameen.start();
        MovieBookThread khan = new MovieBookThread();
        khan.seats=5;
        khan.start();

    }
}
