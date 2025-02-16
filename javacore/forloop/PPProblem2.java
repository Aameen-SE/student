package javacore.forloop;

public class PPProblem2 {
    public static void main(String[] args) {
        //      ****
        //		***
        //		**
        //		*

        for(int i =4;i>=1;i--){
            for(int j =i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Trying some other way to do the same thing ");

        for(int k =4;k>=1;k--){
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
