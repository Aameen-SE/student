package javacore.methd;

public class PrintPrime {
    public static void main(String[] args) {
        //Wap to print all Prime numbers between 1 to n.
        int n=15;
        System.out.println("Print all Prime numbers between 1 to n. where n :"+n);
        printPrime(n);

    }
    public static void printPrime(int n){
        for(int i =1;i<=n;i++){
            if(i==1&&i==2&&i==3)
                System.out.print(i+" , ");
            else if (i%2!=0) {
                System.out.print(i+" , ");
            }
        }
    }

}
