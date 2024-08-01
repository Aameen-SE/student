package corejava.patternprinting;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
       IncStar(num);
        DecStar(num);
    }

    public static void IncStar(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void DecStar(int d)
    {
        for(int i=1;i<=d;i++)
        {
            for(int j=d;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    }



