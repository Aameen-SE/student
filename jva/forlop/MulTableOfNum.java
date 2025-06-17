package jva.forlop;

public class MulTableOfNum {
    public static void main(String[] args) {
        //Multiplication tables from 2 to 5

        for(int i =2;i<=5;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("-----------------------");
        }
    }
}
