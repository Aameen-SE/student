package corejava.oct14;

public class Print1 {
    public static void main(String[] args) {


        printNegative();
        printNegative1();



    }
    public static void printNegative(){
        //wap to print -10 to -1. using for loop
        System.out.println("Printing using for loop : ");
        for(int i = -10;i<=-1;i++){

            System.out.print(i+" ;");
        }
    }

    public static void printNegative1(){
        //wap to print -10 to -1. using for loop
        System.out.println("\nPrinting using while loop : ");
       int num=-10;
        while (num<=-1){
            System.out.print(num+" ; ");
            num++;
        }
    }


}
