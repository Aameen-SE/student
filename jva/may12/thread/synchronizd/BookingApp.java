package jva.may12.thread.synchronizd;

public class BookingApp extends Thread{
    public static void main(String[] args) {
        BookSeat deepak = new BookSeat();
        deepak.bookSeat(15);
        BookSeat amin = new BookSeat();
        amin.bookSeat(20);
    }
}
