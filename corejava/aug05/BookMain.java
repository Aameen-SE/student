package corejava.aug05;

public class BookMain {
    public static void main(String[] args) {

        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(150);
        Book cleanCode = new Book(200);

       artOfComputerProgramming.setAuthor("Donald Knuth");

        effectiveJava.setNoOfPages(100);


        System.out.println(effectiveJava.getNoOfPages());
        effectiveJava.decreasePages(250);
        System.out.println(effectiveJava.getNoOfPages());
    }
}
