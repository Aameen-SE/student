package corejava.aug03;

public class PrintNumRange {
    public static void main(String[] args) {

        printIncreaseNum();
        System.out.println("");
        printDecreaseNum();
    }

    public static void printIncreaseNum(){
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }

    public static void printDecreaseNum(){
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
