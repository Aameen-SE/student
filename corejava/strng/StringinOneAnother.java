package corejava.strng;

import java.util.Scanner;

public class StringinOneAnother {
    public static void main(String[] args) {
        //Insert a String into another String in Java

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String originalString =sc.nextLine();

        System.out.println("Enter the Insertion String");
        String inserString =sc.nextLine();

        System.out.println("Enter the index to be inserted : ");
        int index=sc.nextInt();


        System.out.println("Modified : "+insertString(originalString,inserString,index));

    }
        public static String insertString(String os , String is , int index){
        String str2 = new String();

        for(int i=0;i<os.length();i++)
        {
            str2=str2+os.charAt(i);
            if(i==index)
            {
                str2=str2+is;
            }
        }
        return str2;
        }


}
