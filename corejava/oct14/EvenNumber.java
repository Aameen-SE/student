package corejava.oct14;

public class EvenNumber {
    //wap to print all even numbers between 100 to 120.
    public static void main(String[] args) {
        printEven();
        printEven1();
    }
    public static void printEven(){
        System.out.println("Printing using for loop :");
        for(int i =100;i<=120;i++){
            if(i%2==0){
                System.out.print(i+" ; ");
            }
        }
    }

    public static void printEven1(){
        System.out.println("\nPrinting using while loop :");
        int num=100;
        while(num<=120){
            if(num%2==0){
                System.out.print(num+" ;");
            }
            num++;
        }
    }
}
