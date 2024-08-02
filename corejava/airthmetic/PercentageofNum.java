package corejava.airthmetic;

import java.util.Scanner;

public class PercentageofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained from the total :");
        int numObtained= sc.nextInt();
        System.out.println("Enter the total number of subject :");
        int totalNum=sc.nextInt();

        double percentage = numObtained/totalNum;

        System.out.println("Percentage :"+percentage);
    }
}
