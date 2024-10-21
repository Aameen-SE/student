package corejava.oct14;

public class OddNumber {
    public static void main(String[] args) {
        //wap to print all odd numbers between 120 to 100.
        printOdd();
        printOdd1();
    }

    public static void printOdd(){
        System.out.println("Printing using for loop ");
        for(int i=120;i>=100;i--){
            if(i%2!=0){
                System.out.print(i+" ; ");
            }
        }
    }

    public static void printOdd1(){
        System.out.println("\nPrinting using while loop");
        int num=120;
        while (num>=100){
            if(num%2!=0){
                System.out.print(num+" ; ");
            }
            num--;
        }
    }

}
