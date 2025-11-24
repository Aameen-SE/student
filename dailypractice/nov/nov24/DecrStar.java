package dailypractice.nov.nov24;

public class DecrStar {

    public static void main(String[] args) {
        //      ****
        //		***
        //		**
        //		*

        int num=5;
        decreaseStar(num);
    }

    public static void decreaseStar(int num){

        for(int row=1;row<=num;row++){
            for(int col=row;col<=num;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
