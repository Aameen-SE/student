package corejava.aug03;

public class PrintBet1to100 {
    public static void main(String[] args) {

        printEven();
        printOdd();
    }
    public static void printEven(){
        System.out.println("Even Number between 1 to 100 :");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
                System.out.print(i+" , ");
        }
    }

    public static void printOdd(){
        System.out.println("\n Odd Number between 1 to 100 :");
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
                System.out.print(i+" , ");
        }
    }

}
