package corejava.strng;

import java.util.Scanner;

public class CharacterOutofString {
    public static void main(String[] args) {
        // printing out the character out of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the index number of the character to be printed :");
            int index=sc.nextInt();

            char c= str.charAt(index);
        System.out.println("Character of String "+str+" at index : "+index+" is : "+c);

        System.out.println(getChar(str,index));

    }

    public static char getChar(String str , int i)
    {
        return str.toCharArray()[i];
    }
}
