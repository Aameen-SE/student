package corejava.aug11;

public class Program21 {
    public static void main(String[] args) {
        //wap to print all numbers between 130 to 90 those are not divisible by 10.
        System.out.println("Printing  all numbers between 130 to 90 those are not divisible by 10 using while loop :- ");
        int num =130;
        while (num>=90){
            if(num%10!=0)
            {
                System.out.print(num+" ; ");
            }
            num=num-1;
        }
    }
}
