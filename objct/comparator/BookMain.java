package objct.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Create a Book class with fields title and price. Write a comparator to sort books by price ascending.
class Book{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title : "+title+" Price : "+price;
    }


}
class PriceComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
public class BookMain {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("THE POWER",145.3));
        books.add(new Book("THE POWER OF POSITIVE THINKING",125.3));
        books.add(new Book("THE SUBONCIOUS MIND",105.3));

        Collections.sort(books,new PriceComparator());

        for(Book b:books){
            System.out.println(b);
        }
    }
}
