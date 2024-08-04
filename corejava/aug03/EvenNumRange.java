package corejava.aug03;

public class EvenNumRange {
    public static void main(String[] args) {
        //wap to print all even numbers between 100 to 120.
        System.out.println("Even number from 100 to 120 is :");
        for(int i=100;i<=120;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
