package corejava.oct14;

public class PrintNumberDivisible {
    //wap to print all numbers between 30 to 50 those are not divisible by 7.
    public static void main(String[] args) {
        printNumber();
        printNumber1();
    }
    public static void printNumber(){
        System.out.println("Printing using for loop ");
        for(int i=30;i<=50;i++){
            if(i%7!=0){
                System.out.print(i+" ; ");
            }
        }
    }

    public static void printNumber1(){
        System.out.println("\nPrinting using while loop");
        int num = 30;
        while(num<=50){
            if(num%7!=0){
                System.out.print(num+" ;");
            }
            num++;
        }
    }

}
