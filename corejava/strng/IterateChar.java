package corejava.strng;

import java.util.Scanner;

public class IterateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String words=sc.nextLine();

        for(int i=0;i<words.length();i++)
        {

            System.out.print(words.charAt(i)+" ");
        }
    }
}
