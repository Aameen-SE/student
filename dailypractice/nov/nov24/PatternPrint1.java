package dailypractice.nov.nov24;

public class PatternPrint1 {
    //      *
    //		**
    //		***
    //		****

    public static void main(String[] args) {
        int num =5;
        increaseStar(num);
    }

    public static void increaseStar(int num){
        for(int row =1;row<=num;row++){
            for(int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
