package exceptnhandling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
      method1();
        System.out.println("Main method ended ");
    }

    private static void method1() {
        print();
        System.out.println("Method1 ended ");
    }

    public static void print( ){
        try {
            String str = null;
            str.length();
            System.out.println("Print method ended");
        } catch (Exception exp){
            exp.printStackTrace();
        }

    }
}
