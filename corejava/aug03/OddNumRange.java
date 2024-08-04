package corejava.aug03;

public class OddNumRange {
    public static void main(String[] args) {
        //wap to print all odd numbers between 120 to 100.
        System.out.println("Odd number between 120 to 100");

        for(int i=120;i>=100;i--)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
