package jva.ifelse;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose \n1.Find the smalllest number between two : \n2.Find the smalllest number between three : ");
        int choice =sc.nextInt();
        int num1,num2,num3;
        switch (choice){
            case 1:
                System.out.println("Enter the first num : ");
                num1=sc.nextInt();
                System.out.println("Enter the second num : ");
                 num2 = sc.nextInt();

                 if(num1<num2){
                     System.out.println("First number : "+num1+"is smallest than second num :"+num2);
                 }else
                     System.out.println("Second number : "+num2+"is smallest than First num :"+num1);

            case 2:
                System.out.println("Enter the first num : ");
                num1=sc.nextInt();
                System.out.println("Enter the second num : ");
                num2 = sc.nextInt();
                System.out.println("Enter the third num : ");
                num3=sc.nextInt();
                if(num1<num2&&num1<num3){
                    System.out.println("First number : "+num1+"is smallest among  three num");
                }else if(num2<num1&&num2<num3)
                    System.out.println("Second number : "+num2+"is smallest  among  three num");
                else
                    System.out.println("Third number : "+num3+"is smallest  among  three num");

        }
        sc.close();
    }
}
