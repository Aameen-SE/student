package objct.comparator.lambdaexpression;
//Create a Book class with fields title, price, and numberOfPages.
// Write code to sort books using a lambda expression: first by price ascending, and if prices are equal,
// then by number of pages descending.

import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private int price;
    private int numOfPages;

    public Book(String title, int price, int numOfPages) {
        this.title = title;
        this.price = price;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Title : "+title +"\nPrice : "+price+"\nNumber of Pages : "+numOfPages;
    }
}
public class BookMain {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Power",450,125));
        books.add(new Book("Positive Thinking",550,105));
        books.add(new Book("Power of Subconcious Mind ",350,115));
        books.add(new Book("DSA with Java ",750,195));

        books.sort((e1,e2)-> {
            if (Integer.compare(e1.getPrice(),e2.getPrice())!=0){
                return Integer.compare(e1.getPrice(),e2.getPrice());
            }
            else {
                return Integer.compare(e2.getNumOfPages(),e1.getNumOfPages());
            }
        });

        for (Book b: books){
            System.out.println(b);
        }
    }
}
