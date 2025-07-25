package arrayy;

import java.util.Arrays;

public class AddTwoArrElementIntoOne {

    public static void main(String[] args) {

        int[] firstArr = {1,2,3,4,5,6};
        int [] secondArr ={7,8,9,4,10,11};

        int thirdarr[] = new int[firstArr.length];

        for(int i=0;i<firstArr.length;i++){
            thirdarr[i]=firstArr[i]+secondArr[i];
        }
        System.out.println("Elements that are added then copy to another array ");
        System.out.println("Third Array : "+ Arrays.toString(thirdarr));
    }
}
