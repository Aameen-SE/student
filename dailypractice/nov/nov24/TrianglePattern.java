package dailypractice.nov.nov24;

public class TrianglePattern {
    public static void main(String[] args) {
        int num =4;
        triangle(num);
    }

    public static void triangle(int num){
        //         *
        //		  * *
        //		 * * *
        //		* * * *

        for(int row=1;row<=num;row++){

            // space
            for(int space=row;space<num;space++){
                System.out.print(" ");
            }
            //column

            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
