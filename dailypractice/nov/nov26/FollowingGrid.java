package dailypractice.nov.nov26;

public class FollowingGrid {

    public static void main(String[] args) {
        int num=10;
        print(num);
    }

    //          - - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -
    //			- - - - - - - - - -

    public static void print(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
