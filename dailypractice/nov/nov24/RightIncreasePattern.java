package dailypractice.nov.nov24;

public class RightIncreasePattern {
    public static void main(String[] args) {
       int num=4;
        star(num);
    }
    //               *
    //		        **
    //	       	   ***
    //	    	  ****

    public static void star(int num){
        for(int row=1;row<=num;row++){
            //space
            for(int s=row;s<num;s++){
                System.out.print(" ");
            }
            //column
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
