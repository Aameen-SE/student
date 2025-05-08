package jva.may08;
// try and catch
public class ExceptionProg1 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        }catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Not Abnormally cancelled taking care and printing the line");
    }
}
