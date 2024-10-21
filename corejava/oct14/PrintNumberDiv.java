package corejava.oct14;

public class PrintNumberDiv {
    //wap to print all numbers between 130 to 90 those are not divisible by 10.
    public static void main(String[] args) {
        printDivNotBy10();
        DivNotBy10();
    }

    public static void printDivNotBy10(){
        System.out.println("Printing using for loop : ");
        for(int i=130;i>=90;i--){
            if(i%10!=0){
                System.out.print(i+" ; ");
            }
        }
    }

    public static void DivNotBy10(){
        System.out.println("\nPrinting using while loop");
        int num =130;
        while(num>=90){
            if(num%10!=0){
                System.out.print(num+" ; ");
            }
            num--;
        }
    }
}
