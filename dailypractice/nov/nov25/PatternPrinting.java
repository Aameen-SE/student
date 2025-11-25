package dailypractice.nov.nov25;

public class PatternPrinting {
    public static void main(String[] args) {
        int num=5;
        reverseTriangle(num);
    }

    public static void reverseTriangle(int num){
        //      * * * * *
        //		 * * * *
        //		  * * *
        //		   * *
        //		    *

        for(int row=1;row<=num;row++){

            for(int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int col=row;col<=num;col++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
