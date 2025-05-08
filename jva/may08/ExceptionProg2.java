package jva.may08;

public class ExceptionProg2 {
    public static void main(String[] args) {
        try {
            int a = 0, b = 19, c;
            c = b / a;
        } catch(Exception e){
            e.printStackTrace();
        }   finally {
            System.out.println("Finally is called ");
        }
        System.out.println("Hello");
    }
}
