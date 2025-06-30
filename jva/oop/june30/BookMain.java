package jva.oop.june30;

//1️⃣ Book and Author classes
//
//Create a Book class with title, price, and an Author object.
//
//Create an Author class with name and email.
//
//Implement toString() in both classes to print complete book details.
class Book {
    private String title;
    private int price;
    private Author author;

    public Book(String title, int price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString(){
        return "Title : "+title+"\n Price : "+price+"\n Author : "+author;
    }
}
class Author{
    private String name ;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name : "+name+" ,\nEmail : "+email;
    }
}
public class BookMain {
    public static void main(String[] args) {
        Author author= new Author("Arsalan","arsalan@gmail.com");
        Book book = new Book("Power",1250,author);

        System.out.println(book.toString());
    }
}
