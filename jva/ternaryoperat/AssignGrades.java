package jva.ternaryoperat;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();

        String result = (marks>=90)?"A+" :
                (marks>=75)? "A":
                        (marks>=60)?"B":
                                (marks>=40)?"C":"fail";

        System.out.println("Grade : "+result);

    }
}
