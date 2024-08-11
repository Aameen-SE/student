package corejava.aug11;

public class Program15 {
    public static void main(String[] args) {
        //wap to print all numbers between 30 to 50 those are not divisible by 7.
        System.out.print("all numbers between 30 to 50 those are not divisible by 7.:- ");
        for(int i=30;i<=50;i++)
        {
            if(i%7!=0)
                System.out.print(i+" ; ");
        }
    }
}
