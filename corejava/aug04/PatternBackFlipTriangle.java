package corejava.aug04;

public class PatternBackFlipTriangle {
    public static void main(String[] args) {
        //      * * * * *
        //		 * * * *
        //		  * * *
        //		   * *
        //		    *

        int num=5;

        for(int i=1;i<=num;i++)
        {
            for(int space =1;space<i;space++){
                System.out.print(" ");
            }
            for(int j=num;j>=i;j--){
                System.out.print("* ");}
            System.out.println("");
        }

    }
}
