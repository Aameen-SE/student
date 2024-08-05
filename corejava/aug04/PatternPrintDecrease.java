package corejava.aug04;

public class PatternPrintDecrease {
    public static void main(String[] args) {
        //      ****
        //		***
        //		**
        //		*

        int num =4;
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
