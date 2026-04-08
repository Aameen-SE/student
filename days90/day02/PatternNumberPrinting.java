package days90.day02;

public class PatternNumberPrinting {

    public static void main(String[] args) {

        int num =5;

        patternPrint(num);
    }

    public static void patternPrint(int num){
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
