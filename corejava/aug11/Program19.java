package corejava.aug11;

public class Program19 {
    public static void main(String[] args) {
        //wap to print all odd numbers between 120 to 100.
        System.out.println("Printing using while loop all odd numbers between 120 to 100.:- ");
        int num =120;
        while(num>=100){
            if(num%2!=0) {
                System.out.print(num + " ; ");
            }
            num=num-1;

        }
    }
}
