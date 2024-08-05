package corejava.aug04;

public class PatternPrintRightDecrease {
    public static void main(String[] args) {
        //      ****
        //		 ***
        //		  **
        //		   *

        int num=4;
        for(int i=1;i<=num;i++)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
