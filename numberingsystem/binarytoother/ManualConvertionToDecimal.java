package numberingsystem.binarytoother;

import java.util.Scanner;

public class ManualConvertionToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        String input = sc.nextLine();

        int decimal =0;
        int power=0;

        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='1'){
                decimal= (int) (decimal+Math.pow(2,power));
            }
            power++;
        }

        System.out.println("Decimal : "+decimal);
        sc.close();
    }
}
