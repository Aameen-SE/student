package arrayy;

import java.util.Arrays;

public class CopyTwoArrayintoOne {

    public static void main(String[] args) {

        int[] firstArr = {1,2,3,4,5,6};
        int [] secondArr ={7,8,9,4,10,11};

        System.out.println("First Array : "+Arrays.toString(firstArr));
        System.out.println("Second Array : "+Arrays.toString(secondArr));

        int size = firstArr.length+secondArr.length;
        int [] mergeArr = new int[size];

        for(int i=0;i<firstArr.length;i++){
            mergeArr[i]=firstArr[i];
        }

        int k=0;
        for(int j=firstArr.length;j<size;j++){
            mergeArr[j]=secondArr[k];
            k++;
        }

        System.out.println("Merge Arrays : "+ Arrays.toString(mergeArr));
    }
}
