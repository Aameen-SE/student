package corejava.aug05;

public class Book {

  private  int noOfPages;
    private String author;
    private String bookName;

    Book(int noOfPages){
        this.noOfPages=noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        if(noOfPages>0){
         this.noOfPages = noOfPages;
        }
    }

    void increasePage(int howMuch){
        setNoOfPages(noOfPages+howMuch);
    }
    void decreasePages(int howMuch){
        setNoOfPages(noOfPages-howMuch);
    }

    void printBookName(){
        System.out.println("Print Book is called ");
    }
}
