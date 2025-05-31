package jva.may31;

import java.util.Scanner;

public class NmberofVowels {
    public static void main(String[] args) {
        // count the number of vowels

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine().toLowerCase();

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        System.out.println("Number of vowels in the string : "+count);

    }
}
