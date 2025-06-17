package jva.strng;

import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        //Character frequency count
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        int count =0;
        for(int i=0;i<input.length();i++){
            count++;
        }
        System.out.println(count);
    }
}
