package corejava.aug06;

public class FindFirstLastDigit {
    public static void main(String[] args) {
        int n = 123;


        int ld =n%10;
        System.out.println("Last digit :"+ld);



    }

    public static void printFirstDigit(int n) {
        for (; n > 10; n = n / 10) {

        }
        System.out.println("First digit :"+n);


    }
}
