package corejava.aug11;

public class Program14 {
    public static void main(String[] args) {
        //wap to print all odd numbers between 120 to 100.
        System.out.print("all odd numbers between 120 to 100. :- " );
        for(int i=120;i>=100;i--)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ; ");
            }
        }
    }
}
