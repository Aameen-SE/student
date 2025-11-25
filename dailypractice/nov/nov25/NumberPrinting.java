package dailypractice.nov.nov25;

public class NumberPrinting {
    public static void main(String[] args) {
        int num=4;
        numberPrint(num);
    }
    //      1
    //		1 2
    //		1 2 3

    public static void numberPrint(int num){
        for(int row=1;row<=num;row++){

            for(int col =1;col<=row;col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
