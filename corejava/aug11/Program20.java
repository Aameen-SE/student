package corejava.aug11;

public class Program20 {
    public static void main(String[] args) {
        //wap to print all numbers between 30 to 50 those are not divisible by 7.

        int num =30;
        System.out.println("Printing  all numbers between 30 to 50 those are not divisible by 7 using while loop:- ");
        while(num<=50){
            if(num%7!=0)
            {
                System.out.print(num+" ; ");
            }
            num++;
        }
    }
}
