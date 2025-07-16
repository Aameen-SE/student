package dailypractice.july16;

import java.util.HashMap;
import java.util.Scanner;

public class FindRepeatedChar {
    //Write a Java method that finds the first repeated character in a given string using a HashMap.
    //If no character repeats

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str =sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            if(map.containsKey(c)){
                System.out.println(c);
                break;
            }else {
                map.put(c,1);
            }
        }


    }
}
