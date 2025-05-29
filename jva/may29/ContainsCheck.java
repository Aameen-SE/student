package jva.may29;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContainsCheck {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruits to check available or not : ");
        String input = sc.nextLine().toLowerCase();

        boolean found = false;
        for(String fr :fruits){
            if(fr.equalsIgnoreCase(input)){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Fruit : "+input+" is available");
        else
            System.out.println("Not available ");
    }
}
