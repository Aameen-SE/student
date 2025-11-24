package dailypractice.nov.nov24;

public class RightDecreaseStar {

    public static void main(String[] args) {
        int num =5;
        rightDecreaseStar(num);
    }

    public static void rightDecreaseStar(int num){
        //      ****
        //		 ***
        //		  **
        //		   *

        for(int row=1;row<=num;row++){

            //space
            for(int s =1;s<row;s++){
                System.out.print(" ");
            }
            //column
            for(int col=row;col<=num;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
