package dailypractice.nov.nov25;

public class NumberPrint {
    public static void main(String[] args) {
        int num=4;
        numberPrint(num);
    }
    //      1
    //		2 2
    //		3 3 3

    public static void numberPrint(int num){
        for(int row=1;row<=num;row++){

            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }

            System.out.println();
        }
    }
}
