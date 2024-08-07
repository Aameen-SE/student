package corejava.aug06;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book(100);
        System.out.println(book.getNoOfPages());

        book.increasePages(50);
        System.out.println("no of pages after increasing :"+book.getNoOfPages());

    }
}
