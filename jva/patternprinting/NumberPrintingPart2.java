package jva.patternprinting;

public class NumberPrintingPart2 {
    public static void main(String[] args) {
        //      1
        //		2 2
        //		3 3 3

        int num =5;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
