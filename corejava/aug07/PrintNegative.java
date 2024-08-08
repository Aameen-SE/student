package corejava.aug07;

public class PrintNegative {
    public static void main(String[] args) {
        //void printNegative(int[]), method will print all negative number from supplied array
        int[] array={-12,24,-54,-9,89,10,-5};

        printNegative(array);
    }
    public static void printNegative(int[] neg){
        for(int i=0;i<neg.length;i++)
        {
            if(neg[i]<0)
                System.out.println(neg[i]);
        }

    }
}
