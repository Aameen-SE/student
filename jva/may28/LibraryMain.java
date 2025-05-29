package jva.may28;
//Create a simple console-based Library System with the following features:
//
//Add a new book to the library.
//
//View all books in the library.
//
//Search for a book by title

import java.util.ArrayList;
import java.util.Scanner;

class Book{

    private String title ;
   private String  author ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title , String author){
       this.title=title;
       this.author=author;
   }

   public String toString(){
       return title+" by "+ author;
   }
}

class Library{

    private ArrayList<Book> books =new ArrayList<>();
    //addBook(Book book)
    public void addBook(Book book){
        books.add(book);
        System.out.println("Books added");
    }

    //
    //viewBooks()
    public void viewBook(){
        if(books.isEmpty())
            System.out.println("No books in the library ");
        else
            System.out.println("Books in the library ");
            for(Book book :books){
                System.out.println(book);
            }
        System.out.println();
    }
    //
    //searchByTitle(String title)
    public void searchByTitle(String title){
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle()==title) {
                System.out.println("Book Found: " + book + "\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.\n");
        }
    }


}
public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("1. Add book");
            System.out.println("2. View book");
            System.out.println("3. Search by title");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    library.viewBook();
                    break;
                case 3:
                    System.out.println("Enter the title ");
                    String searchTittle = sc.nextLine();
                    library.searchByTitle(searchTittle);

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
}
