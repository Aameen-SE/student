package corejava.aug05;

public class CopyTwoinOne {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArr= new int[array1.length+ array2.length];

        for(int i=0;i< array1.length;i++)
        {
            mergedArr[i]=array1[i];
        }

        for (int i=0;i< array2.length;i++)
        {
            mergedArr[array1.length+i]=array2[i];
        }

        for(int i=0;i< mergedArr.length;i++)
        {
            System.out.print( mergedArr[i]+" ");
        }


    }
}

