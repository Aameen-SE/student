package corejava.patternprinting;

import java.util.Scanner;

public class NumPrint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

       IncPrint(num);
       DecPrint(num);

    }

    public static void IncPrint(int n){
        /*1
        * 22
        * 333
        * */
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void DecPrint(int n){
        /*333
        * 22
        * 1
        * */

        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
