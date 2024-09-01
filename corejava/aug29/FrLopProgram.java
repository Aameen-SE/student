package corejava.aug29;

public class FrLopProgram {
    public static void main(String[] args) {

        printEvenNum();
        printOddNum();
        printNumberDivBy7();
        prinNumberNotDivBy10();
    }
    //wap to print all even numbers between 100 to 120.
    public static void printEvenNum(){
        System.out.println("Printing Even number between 100 to 120. ");
        for(int i=100;i<=120;i++){
            if(i%2==0){
                System.out.print(i+" ; ");
            }
        }
    }

    //wap to print all odd numbers between 120 to 100.
    public static void printOddNum(){
        System.out.println("\nPrinting odd numbers between 120 to 100. ");
        for(int i=120;i>=100;i--){
            if(i%2!=0){
                System.out.print(i+" ; ");
            }
        }
    }

    //wap to print all numbers between 30 to 50 those are not divisible by 7.
    public static void printNumberDivBy7(){
        System.out.println("\n Printing all numbers between 30 to 50 those are not divisible by 7 : ");
        for(int i =30;i<=50;i++){
            if(i%7!=0){
                System.out.print(i+" ; ");
            }
        }
    }
    //wap to print all numbers between 130 to 90 those are not divisible by 10.
    public static void prinNumberNotDivBy10(){
        for(int i =130;i>=90;i--){
            if(i%10!=0){
                System.out.print(i+" ; ");
            }
        }
    }
}
