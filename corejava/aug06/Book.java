package corejava.aug06;

public class Book {
    private int noOfPages;

    Book(int noOfPages){
     this.noOfPages=noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;

    }
    public void increasePages(int num)
    {
        this.noOfPages=noOfPages+num;
    }
}
